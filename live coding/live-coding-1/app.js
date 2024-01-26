//Ana Karen Bailón Fernández


// Paso 1
function PalabrasLargas(inputString, stringArray) {
  return stringArray.filter(word => word.length > inputString.length);
}

// Paso 2
function printArray(stringArray) {
  const listContainer = document.getElementById('wordList');
  listContainer.innerHTML = ''; // Limpiar el contenido anterior

  stringArray.forEach(word => {
    const listItem = document.createElement('li');
    listItem.textContent = word;
    listContainer.appendChild(listItem);
  });
}

// Bonus - Paso 1
document.getElementById('submitButton').addEventListener('click', function() {
  const userInput = document.getElementById('userInput').value;
  const filteredArray = PalabrasLargas(userInput, miArray); // Cambiado a miArray
  console.log(miArray);
  printArray(filteredArray);
});

// Bonus - Paso 2
const miArray = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio', 'elefante', 'computadora', 'playa', 'montaña'];
printArray(miArray);