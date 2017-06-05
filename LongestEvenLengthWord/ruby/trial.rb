# Complete the function below.
def longestEvenWord(sentence)
    maxFound = false;
    maxItem = "";
    maxLen = 0;
    
    for  item in sentence.split(" ") 
        if item.length % 2 == 0 && item.length > maxLen then
            maxFound = true;
            maxItem = item;
            maxLen = item.length;
        end
    end
    return maxFound ? maxItem : "00";
end

# DO NOT MODIFY THE CODE BELOW THIS LINE!
_sentence = gets.to_s.strip;

puts longestEvenWord(_sentence);
