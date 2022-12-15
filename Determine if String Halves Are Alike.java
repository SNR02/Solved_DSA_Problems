// Problem Link : https://leetcode.com/problems/determine-if-string-halves-are-alike/description/

// The aim of the problem is to check whether two halfs of a single string contains equal number of vowels or not
// If equal count of vowels present in both the halves we have to return true

// For this initially we declare a string with vowels as ov
// Later we split the given string into two halves and store half1 and half2 into h1 and h2 respectively
// Later we count the number of vowels in both the halves using charAt() in nested for-loop 
// We store the count of vowels in h1 and h2 in count1 and count2 respectively 
// Atlast we check whether both the counts are equal or not
// We return true if the count values are equal

class Solution {
    public boolean halvesAreAlike(String s) {
        int i,j;
        int n=s.length();
        String h1="";
        String h2="";
        String ov="aeiouAEIOU";
        int count1=0,count2=0;
        for(i=0;i<n/2;i++){
            h1+=s.charAt(i);
        }
        for(i=n/2;i<n;i++){
            h2+=s.charAt(i);
        }
        for(i=0;i<h1.length();i++){
            for(j=0;j<ov.length();j++){
                if(h1.charAt(i)==ov.charAt(j)){
                    count1++;
                }
            }
        }
        for(i=0;i<h2.length();i++){
            for(j=0;j<ov.length();j++){
                if(h2.charAt(i)==ov.charAt(j)){
                    count2++;
                }
            }
        }
        if(count1==count2){
            return true;
        }
        return false;
    }
}
