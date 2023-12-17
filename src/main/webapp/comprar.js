import { datos,opciones } from './data/data.js';


console.log('Valor: ',datos);

//Asigne a una variable cada dato del import
const valorEstudiante=datos.estudiante;
const valorTrainee=datos.trainee;
const valorJunior=datos.junior;
const valor=datos.valor;

//Datos que estan en los inputs o select

const selectElement = document.getElementById('select');
const calcularButton = document.getElementById('calcularButton');
const resultadoElement = document.getElementById('resultado');
const resetButton=document.getElementById('resetButton')
const inputElement = document.getElementById('cantidad');


//Utilizamos Doom para generar etiquetas en el select

function generarSelecciones() {
    const select = document.getElementById('select'); 
    opciones.forEach(opcion => {
        const option = document.createElement('option');
        option.value = opcion.value;
        option.textContent = opcion.textContent;
        select.appendChild(option);
    });
}

generarSelecciones();


calcularButton.addEventListener('click',function() {
    const seleccion = selectElement.value;
    const cantidad = parseInt(inputElement.value);
    console.log("Cantidad",cantidad);
    let descuento=0;
    parseInt(descuento);
    console.log("Descuento",descuento);
    console.log("seleccion",seleccion);
    console.log("Estudiante: ", valorEstudiante);
    switch (seleccion) {
        case 'estudiante':
            descuento=(cantidad*valor-valorEstudiante*cantidad*valor);
            break;
        case 'trainee':
            descuento=(cantidad*valor-valorTrainee*cantidad*valor);
            break;
        case 'junior':
            descuento=(cantidad*valor-valorJunior*cantidad*valor);
            break;
        default:
            descuento=(cantidad*valor);
   }
   resultadoElement.textContent = `$  ${descuento.toFixed(2)}`;
   console.log("SADSADSADSADA ",descuent.toFixed(2))
});
resetButton.addEventListener('click',function() {
    let descuento=0;
    resultadoElement.textContent = `$ ${descuento}`;
});
document.addEventListener("DOMContentLoaded", function() {
    var miImagen = document.getElementById("imagen");
    miImagen.addEventListener("click", function() {
      // Redirecciona a la URL deseada
      window.location.href = "index.html";
    });
  })