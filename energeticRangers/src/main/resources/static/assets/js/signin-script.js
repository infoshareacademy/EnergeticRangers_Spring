const pass = document.getElementById("password");
const repeatpass = document.getElementById("repeatpass");
const submitBtn = document.querySelector("#submit-btn");
const form = document.getElementsByTagName("form");

function matchPass (e){

    if (pass.value != repeatpass.value) {
        alert("Podane hasła muszą być takie same!")

        return
    }
}


submitBtn.addEventListener('click', matchPass)