function reverseWords(sentence) {
    const words = sentence.split(/\s+/);
    const reversedWords = words.map(word => reverseString(word));
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

function reverseString(str) {
    return str.split('').reverse().join('');
}


const inputSentence = prompt("Enter a sentence:"); 
const reversedSentence = reverseWords(inputSentence);
console.log("Reversed sentence:", reversedSentence);