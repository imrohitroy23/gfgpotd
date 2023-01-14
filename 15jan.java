public class 15jan {
    long countSubstring(String S){
    long count = 0, numOfZeroes = 0;
    int zeroIndex = S.length();

    int frequency[] = new int[2 * S.length() + 5];

    int currentCount=zeroIndex;

    for(int i = 0; i < S.length(); i++){
        if(S.charAt(i) == '0')
            currentCount--;
        else
            currentCount++;

        if(currentCount <= zeroIndex){
            numOfZeroes++;
        }
        frequency[currentCount]++;
    }

   
    for(int i = 0; i < S.length(); i++){
        count += (S.length() - i - numOfZeroes) * 1l;

        if(S.charAt(i) == '1'){
            frequency[zeroIndex+1]--;
            zeroIndex++;
            numOfZeroes += frequency[zeroIndex];
        }
        else{
            frequency[zeroIndex-1]--;
            zeroIndex--;
            numOfZeroes--;
            numOfZeroes -= frequency[zeroIndex+1];
        }
    }

    return count;
}
}
