const inputNombre = document.querySelector("#input-nombre");
const btnSaludar = document.querySelector("#btn-saludar");
const btnLimpiar = document.querySelector("#btn-limpiar");
const mensajeResultado = document.querySelector("#mensaje-resultado");

function generarSaludo() {
    const nombre = inputNombre.value;
    mensajeResultado.textContent = "Saludos"+nombre;
}

function limpiar() {
    inputNombre.value = "";
    mensajeResultado.textContent = "Esperando interacción...";
}

btnSaludar.addEventListener("click", generarSaludo);
btnLimpiar.addEventListener("click", limpiar);

