
//asignamos variables a los id de las etiquetas
const comprarButton = document.getElementById('comprarButton');
const oradorButton= document.getElementById('oradorButton')




//funciones segun id de los botones

comprarButton.addEventListener('click', function() {
    // Redirigir a la página 'comprar.html'
    window.location.href = './comprar.html';
});

oradorButton.addEventListener('click',function(){
    window.location.href='#convierte'
});

