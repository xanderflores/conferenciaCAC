console.log("El archivo oradores.js se está cargando correctamente.");



function listarOradores() {
			event.preventDefault();

			fetch('oradores', {
				method: "GET"
			})
				.then(response => response.json())
				.then(data => renderizarTabla(data))
				.catch(error => console.log("Error al traer los usuarios ..." + error))

		}
function renderizarTabla(data) {
			const tabla = document.getElementById('cuerpoTabla');
			tabla.innerHTML = '';
			console.log(data)
			data.forEach(element => {
				console.log(element);
				const fila = document.createElement('tr');
				fila.innerHTML = `<td>${element.idUsuario}</td>
                        <td>${element.nombre}</td>
                        <td>${element.apellido}</td>
                        <td>${element.descripcion}</td>`;
				tabla.appendChild(fila);
			});
		}


