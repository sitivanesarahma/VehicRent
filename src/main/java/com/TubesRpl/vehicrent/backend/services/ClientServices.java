package com.TubesRpl.vehicrent.backend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.TubesRpl.repository.ClientRepository;
import com.TubesRpl.vehicrent.backend.models.Client;
import com.TubesRpl.vehicrent.backend.payloads.response.Response;

@Service
public class ClientServices implements BaseServices<Client>{
    @Autowired
    private ClientRepository clientRepository;
    
    @Override
    public Response DisplayAllData(){
        List<Client> allClient = new ArrayList<>();
        clientRepository.findAll().forEach(allClient::add);
        for (Client client : allClient){
            System.out.println("ID Client: " + client.getID_Client());
            System.out.println("NIK User: " + client.getUser());
        }
        return new Response(HttpStatus.OK.value(), "Success", allClient);
    }

    @Override
    public Response Create(Client model){
        try{
            clientRepository.save(model);
            return new Response(HttpStatus.OK.value(), "Success", model);
        }catch(Exception e){
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", model);
        }
    }

    @Override
    public Response Update(Integer id, Client model){
        try{
            Client client = clientRepository.findById(id).orElse(null);
            if (client != null){
                client.setUser(model.getUser());
                clientRepository.save(client);
                return new Response(HttpStatus.OK.value(), "Success", client);
            }else{
                return new Response(HttpStatus.NOT_FOUND.value(), "Client not found", null);
            }
        }catch(Exception e){
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", null);
        }
    }

    @Override
    public Response Delete(Integer id){
        try{
            Client client = clientRepository.findById(id).orElse(null);
            if (client != null){
                clientRepository.deleteById(id);
                return new Response(HttpStatus.OK.value(), "Success", client);
            }else{
                return new Response(HttpStatus.NOT_FOUND.value(), "Client not found", null);
            }
        }catch(Exception e){
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", null);
        }
    }

    @Override
    public Response DisplayByID(Integer id){
        try {
            Client client = clientRepository.findById(id).orElse(null);
            if (client != null) {
                System.out.println("ID Client: " + client.getID_Client());
                System.out.println("NIK User: " + client.getUser().getNIK_User());
                System.out.println("No SIM: " + client.getNoSIM());
                System.out.println("ID Rekomendasi: " + client.getRekomendasi());
                return new Response(HttpStatus.OK.value(), "Success", client);
            } else {
                return new Response(HttpStatus.NOT_FOUND.value(), "Client not found", null);
            }
        } catch (Exception e) {
            return new Response(HttpStatus.BAD_REQUEST.value(), "Failed", null);
        }
    }
}
