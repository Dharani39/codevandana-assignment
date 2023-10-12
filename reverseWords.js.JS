function reverseWords(sentence) {
var words = sentence.split(" "); 
var reversedWords = [];
for (var i = 0; i < words.length; i++) 
{
 var word = words[i]; var reversedWord = "";

for (var j = word.length-1;j>= 0; j--) 
{
 reversedWord += word.charAt(j);
}
reversedWords.push(reversedWord);
}
var reversedSentence = reversedWords.join("");
return reversedSentence;
}
var sentence = "This is a sunny day";
var reversedSentence = reverseWords(sentence);
alert(reversedSentence);

