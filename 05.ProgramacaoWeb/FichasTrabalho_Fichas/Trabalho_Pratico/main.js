//Função Toast
const toastTrigger = document.getElementById('toastTrigger')
const toastAlert = document.getElementById('toastAlert')

if (toastTrigger) {
  toastTrigger.addEventListener('click', () => {
    
    const toast = new bootstrap.Toast(toastAlert);
    toast.show();
  });
}

/*Validações
function validateForm() {
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const nameError = document.getElementById("name-error");
    
    
    const emailError = document.getElementById(
        "email-error"
    );
   
    const subjectError = document.getElementById(
        "subject-error"
    );

    nameError.textContent = "";
    emailError.textContent = "";
    agreeError.textContent = "";

    let isValid = true;

    
    if(name === "" || /\d/.test(name)) {
        nameError.textContent =
            "Insira um nome válido.";
        isValid = false;
    }
      
    if(email === "" || !email.includes("@")) {
            emailError.textContent =
                "Insira um email válido.";
            isValid = false;
    }

    return isValid;
}*/


