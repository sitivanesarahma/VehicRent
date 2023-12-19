<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="session" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous" />


    <!-- Fonts Google -->
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,400;0,700;1,500&display=swap"
            rel="stylesheet" />

    <style>
        html,
        body {
        /*overflow: hidden;*/
        }

        * {
        font-family: "Poppins", sans-serif;
        }

        .register {
        height: 100vh;
        }

        .register-left {
        margin-top: -100px;
        transform: scale(0.75);
        }

        .header h1 {
        flex-shrink: 0;
        color: #000;
        font-size: 40px;
        font-style: normal;
        font-weight: 700;
        line-height: normal;
        margin-bottom: 16px;
        margin-top: 16px;
        }

        .header p {
        flex-shrink: 0;
        color: #000;
        font-size: 16px;
        font-style: normal;
        font-weight: 500;
        line-height: normal;
        opacity: 0.6;
        margin-bottom: 28px;
        }

        .register-form .fields {
        display: flex;
        align-items: center;
        justify-content: space-between;
        }

        .input-fields label {
        color: #000;
        font-size: 16px;
        font-style: normal;
        font-weight: 400;
        line-height: normal;
        margin-top: 20px;
        flex-direction: column;
        }

        .input-fields input {
        color: #000;
        font-size: 12px;
        font-style: normal;
        font-weight: 400;
        line-height: normal;
        opacity: 0.4;
        width: 312px;
        height: 40px;
        flex-shrink: 0;
        border-radius: 16px;
        border: 1px solid rgba(0, 0, 0, 0.3);
        background: #fff;
        flex-direction: column;
        }

        input .custom-large {
        display: flex;
        justify-content: center;
        align-items: center;
        width: 100%;
        }

        .register-form .fields2 {
        display: flex;
        align-items: center;
        justify-content: flex-start;
        }

        .input-fields2 label {
        color: #000;
        font-size: 16px;
        font-style: normal;
        font-weight: 400;
        line-height: normal;
        margin-top: 20px;
        flex-direction: column;
        }

        .input-fields2 input {
        color: #000;
        font-size: 12px;
        font-style: normal;
        font-weight: 400;
        line-height: normal;
        opacity: 0.4;
        width: 655px;
        height: 40px;
        flex-shrink: 0;
        border-radius: 16px;
        border: 1px solid rgba(0, 0, 0, 0.3);
        background: #fff;
        flex-direction: column;
        }

        .register-form a {
        flex-shrink: 0;
        color: #616161;
        font-size: 14px;
        font-style: normal;
        font-weight: 400;
        line-height: normal;
        margin-top: 10px;
        display: block;
        }

        .register-form .masuk {
        width: 655px;
        height: 48px;
        flex-shrink: 0;
        border-radius: 16px;
        border: 1px solid rgba(0, 0, 0, 0.3);
        background: #a0bc71;
        color: #fff;
        margin-top: 24px;
        }

        .register-form .masukgoogle {
        width: 655px;
        height: 48px;
        flex-shrink: 0;
        border-radius: 16px;
        border: 1px solid rgba(0, 0, 0, 0.3);
        background: #fff;
        }

        .register-form span {
        color: #000;
        font-size: 16px;
        font-style: normal;
        font-weight: 400;
        line-height: normal;
        width: 309px;
        height: 29px;
        flex-shrink: 0;
        margin-top: 10px;
        display: block;
        }

        .register-form .form-check {
        display: flex;
        align-items: center;
        justify-content: flex-start;
        margin-top: 28px;
        }

        .form-check .form-check-inpt {
        display: flex;
        justify-content: flex-start;
        margin-right: 12px;
        margin-left: -20px;
        }

        .register-gambar {
        background-image: url("img/img-login.png");
        background-position: left center;
        background-size: cover;
        }

        .register-wrapper {
        padding-left: 100px;
        margin-left: 0px;
        }

        .register-desc-wrapper {
        width: 70%;
        }

        .divider {
        display: flex;
        align-items: center;
        margin-top: 20px;
        color: rgba(0, 0, 0, 0.4);
        }

        .divider::before,
        .divider::after {
        flex: 1;
        content: "";
        padding: 1.25px;
        background-color: black;
        opacity: 0.1;
        margin: 5px;
        }

        .navigasi {
        margin-bottom: 24px;
        box-shadow: 1px 4px 5px 0px rgba(0, 0, 0, 0.05);
        }

        .card-text {
        color: black;
        font-size: 16px;
        }

        .card.inactive .card-text {
        color: #8aae92;
        }

        .konfirmasi {
        padding-top: 1rem;
        padding-bottom: 2rem;
        }

        .konfirmasiPage {
        width: 100%;
        }

        .konfirmasiPage .title .title-text {
        color: #000;
        text-shadow: 0px 4px 4px rgba(0, 0, 0, 0.1);
        font-family: Poppins;
        font-size: 32px;
        font-style: normal;
        font-weight: 500;
        line-height: normal;
        margin-bottom: 2rem;
        }

        .konfirmasiPage .pilihPeran {
        justify-content: center;
        gap: 4rem;
        }

        .pilihPeran .cardRegent {
        background-color: #f4f9f4;
        }

        .pilihPeran .cardClient {
        background-color: #f4f9f4;
        }

        .header5 {
        color: #000;
        font-family: Poppins;
        font-size: 24px;
        font-style: normal;
        font-weight: 600;
        line-height: normal;
        }

        .header5 p {
        color: #000;
        font-family: Poppins;
        font-size: 16px;
        font-style: normal;
        font-weight: 400;
        line-height: normal;
        }

        .card-title {
        font-size: 16px;
        margin-bottom: 0;
        }

        .card-body-navigasi {
        padding: 1rem;
        }

        .card-body-peran {
        padding: 0;
        margin-bottom: 1rem;
        }

        .button-choose {
        width: 100%;
        text-decoration: none;
        background-color: #fff;
        color: #000;
        text-align: center;
        font-size: 12px;
        padding-top: 12px;
        padding-bottom: 12px;
        border-radius: 12px;
        flex-shrink: 0;
        border: 1px solid rgba(0, 0, 0, 0.3);
        box-shadow: 0px 4px 4px 0px rgba(0, 0, 0, 0.15);
        transition: all 0.25s ease;
        justify-content: center;
        }

        .button-pilih:active {
        opacity: 0.6;
        transition: all 0.25s ease;
        }

        .card-img-center {
        width: 100%;
        }

        .cardPeran {
        display: flex;
        flex-direction: column;
        justify-content: space-between;
        padding: 2rem;
        border-radius: 1rem;
        box-shadow: 1px 4px 5px 0px rgba(0, 0, 0, 0.19);
        }
        .button-pilih{
        width: 100%;
        text-decoration: none;
        text-align: center;
        font-size: 12px;
        border-radius: 12px;
        flex-shrink: 0;
        border: 1px solid rgba(0, 0, 0, 0.3);
        box-shadow: 0px 4px 4px 0px rgba(0, 0, 0, 0.15);
        transition: all 0.25s ease;
        justify-content: center;
        background-color: #A0BC71;
        padding: 10px;
        margin-top: 32px;
        margin-bottom: 10px;
        width: 100px;
        margin-left: 1400px;
        float: left;
        color: #fff;
        }
    </style>
    <title>Registrasi Form</title>
    </head>
    <body>
    <section class="register d-flex">
        <div class="register-left w-50">
            <img src="img/img logo.png" alt="Welcome Image" width="200" style="margin-left: -120px;" />
            <div class="row">
                <div class="col-12 d-flex flex-column align-items-center justify-content-center">
                    <div class="header d-flex flex-column align-items-center">
                        <h1>DAFTAR AKUN</h1>
                        <p>Selamat datang! Mau rental apa hari ini?</p>
                    </div>
                    <div class="register-form">
                        <button class="masukgoogle">
                            <img src="img/img google.png" alt="" />
                            Masuk menggunakan google
                        </button>

                        <div class="divider">atau</div>

                        <div class="fields">
                            <div class="input-fields">
                                <label for="namadepan" class="form-label">Nama Depan</label>
                                <input type="namadepan" class="form-control" id="namadepan"
                                    placeholder="Masukkan Nama Depan Anda" />
                            </div>

                            <div class="input-fields">
                                <label for="namabelakang" class="form-label">Nama Belakang</label>
                                <input type="namabelakang" class="form-control" id="namabelakang"
                                    placeholder="Masukkan Nama Belakang Anda" />
                            </div>
                        </div>

                        <div class="fields">
                            <div class="input-fields">
                                <label for="nomortelepon" class="form-label">Nomor Telepon</label>
                                <input type="nomortelepon" class="form-control" id="nomortelepon"
                                    placeholder="Masukkan Nomor Telepon Anda" />
                            </div>

                            <div class="input-fields">
                                <label for="nomorkontakdarurat" class="form-label">Nomor Kontak Darurat</label>
                                <input type="nomorkontakdarurat" class="form-control" id="nomorkontakdarurat"
                                    placeholder="Masukkan Nomor Kontak Darurat Anda" />
                            </div>
                        </div>

                        <div class="fields">
                            <div class="input-fields">
                                <label for="umur" class="form-label">Umur</label>
                                <input type="umur" class="form-control" id="umur" placeholder="Masukkan Umur Anda" />
                            </div>

                            <div class="input-fields">
                                <label for="fototerbaru" class="form-label">Foto Terbaru</label>
                                <input class="form-control custom-large" id="fototerbaru" type="file" />
                            </div>
                        </div>

                        <div class="fields">
                            <div class="input-fields">
                                <label for="email" class="form-label">Email</label>
                                <input type="email" class="form-control" id="email" placeholder="Masukkan Email Anda" />
                            </div>

                            <div class="input-fields">
                                <label for="katasandi" class="form-label">Kata Sandi</label>
                                <input type="katasandi" class="form-control" id="katasandi"
                                    placeholder="Masukkan Kata Sandi Anda" />
                            </div>
                        </div>

                        <div class="fields2">
                            <div class="input-fields2">
                                <label for="alamatlengkap" class="form-label">Alamat Lengkap</label>
                                <input type="alamatlengkap" class="form-control" id="alamatlengkap"
                                    placeholder="Masukkan Alamat Lengkap Anda" />
                            </div>
                        </div>

                        <div class="form-check">
                            <input class="form-check-inpt" type="checkbox" value="" id="flexCheckDefault">
                            <label class="form-check-label" for="flexCheckDefault">
                                Saya menyetujui semua Ketentuan, Privasi, dan Biaya
                            </label>
                        </div>

                        <!-- Button trigger modal -->
                        <button type="button" class="masuk btn" data-bs-toggle="modal" data-bs-target="#myModal">
                            Masuk
                        </button>

                        <div style="margin-top: 10px; margin-bottom: 100px;">
                            <span class="d-inline">Sudah mempunyai akun? <a
                                    href="<%= request.getContextPath() %>/login"
                                    class="signup d-inline text-decoration-none">Masuk</a></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="register-right w-50 h-100">
            <div class="position-relative w-100 h-100 register-gambar d-flex justify-content-center align-items-center">
                <div class="register-wrapper text-white bg-black bg-opacity-75 w-100 d-flex justify-content-start py-4">
                    <div class="register-desc-wrapper">
                        <h2 class="fw-bolder">Tentang Kami</h2>
                        <p class="fw-normal">Perusahaan rental terbaik dan terlengkap. Moto kami pelanggan puas, Kami senang,
                            Kami VehicRent siap melayani</p>
                    </div>
                </div>
            </div>
        </div>
        <!-- Modal Sukses -->
        <div id="successModal" class="modal fade" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
            aria-labelledby="successModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content d-flex justify-content-center align-items-center">
                    <div class="modal-body text-center">
                        <img src="img/img_checklist.png" alt="Checklist Image" width="100" />
                        <p>Terima kasih. Akun anda telah berhasil didaftarkan</p>
                    </div>
                    <div class="modal-footer">
                        <button type="verification-button" class="btn btn-secondary">Verification Data</button>
                    </div>
                </div>
            </div>
        </div>

        <!-- Modal Gagal -->
        <div id="errorModal" class="modal fade" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
            aria-labelledby="errorModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered">
                <div class="modal-content d-flex justify-content-center align-items-center">
                    <div class="modal-body text-center">
                        <img src="img/img_error.png" alt="Error Image" width="100" />
                        <p>Mohon lengkapi formulir dengan benar.</p>
                    </div>
                    <div class="modal-footer">
                        <button type="close-button" class="btn btn-secondary" data-bs-dismiss="modal">Complete
                            Data</button>
                    </div>
                </div>
            </div>
        </div>
    </section>

        <!-- Optional JavaScript; choose one of the two! -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>

        <script>
            document.addEventListener('DOMContentLoaded', function () {
                var successModal = new bootstrap.Modal(document.getElementById('successModal'));
                var errorModal = new bootstrap.Modal(document.getElementById('errorModal'));

                function checkFormInputs() {
                    var inputs = document.querySelectorAll('.form-control');
                    for (var i = 0; i < inputs.length; i++) {
                        if (!inputs[i].value) {
                            return false;
                        }
                    }
                    return true;
                }

                function showSuccessModal() {
                    successModal.show();
                }

                function showErrorModal() {
                    errorModal.show();
                }

                function showVerificationPage() {
                    // Keep the success modal open for 2 seconds (2000 milliseconds)
                    setTimeout(function () {
                        // Redirect to the verification page
                        window.location.href = 'localhost/register-pilihperan';
                    }, 2000);
                }

                function showAppropriateModal() {
                    if (checkFormInputs() && document.getElementById('flexCheckDefault').checked) {
                        showSuccessModal();
                        // Call showVerificationPage after showing the success modal
                        showVerificationPage();
                    } else {
                        showErrorModal();
                    }
                }

                var masukButton = document.querySelector('.masuk');
                masukButton.addEventListener('click', function () {
                    showAppropriateModal();
                });
            });
        </script>
    </body>
</html>
