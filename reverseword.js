function reverseWords(sentence) {
    let reversedSentence = '';
    let word = '';
    
    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] === ' ' || i === sentence.length - 1) {
            if (i === sentence.length - 1) {
                word = word + sentence[i];
            }
            
            let reversedWord = '';
            for (let j = word.length - 1; j >= 0; j--) {
                reversedWord += word[j];
            }
            
            reversedSentence += reversedWord + ' ';
            word = '';
        } else {
            word += sentence[i];
        }
    }

    return reversedSentence;
}

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a sentence: ', (sentence) => {
    const reversed = reverseWords(sentence);
    console.log('Reversed sentence: ' + reversed);
    rl.close();
});
