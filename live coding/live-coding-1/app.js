////PARAMETRO1
function palabraLarga(str, array) {
    return array.filter(word => word.length > str.length);
  }
  
  const animales = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio'];
  const palabraLarga = palabrasLarga('bocina', palabra);
  console.log(palabraLarga); // Para iterar a traves de los elemento en un array

/////PARAMETRO 2

function printArray(array) {
    const listContainer = document.getElementById('myList'); // Assume there's an element with the id 'myList' in your HTML
    listContainer.innerHTML = ''; // Clear previous content
  
    array.forEach(word => {
      const listItem = document.createElement('li');
      listItem.textContent = word;
      listContainer.appendChild(listItem);
    });
  }
  
  // EJEMPLO 
  const myArray = ['insecto', 'bootcamp', 'escritorio'];
  printArray(myArray);
