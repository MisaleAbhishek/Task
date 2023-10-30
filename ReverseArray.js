const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the size of the array: ', (size) => {
  size = parseInt(size);
  if (isNaN(size)) {
    console.log('Invalid size. Please enter a valid number.');
    rl.close();
    return;
  }

  const elements = [];

  function inputElement(index) {
    if (index < size) {
      rl.question(`Enter element ${index + 1}: `, (element) => {
        element = parseInt(element);
        if (!isNaN(element)) {
          elements.push(element);
          inputElement(index + 1);
        } else {
          console.log('Invalid input. Please enter a valid number.');
          inputElement(index);
        }
      });
    } else {
      rl.close();
      sortAndDisplay(elements);
    }
  }

  inputElement(0);
});

function sortAndDisplay(array) {
  const sortedArray = array.sort((a, b) => b - a);
  console.log('Sorted array:', sortedArray.join(', '));
}
