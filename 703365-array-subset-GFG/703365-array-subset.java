
class Solution {
    public boolean isSubset(int a[], int b[]) {
         HashMap<Integer,Integer> aMap =  new HashMap<>();
               for(int ele : a){
                   if(aMap.containsKey(ele)) {        // agar map me element nahi hai to contains karta hai
                       int freq = aMap.get(ele);       // us map ki freq nikalta hai
                       aMap.put(ele,freq+1);
                   }
                   else aMap.put(ele,1);
               }
               HashMap<Integer,Integer> bMap =  new HashMap<>();
               for (int ele : b){
                   if (!aMap.containsKey(ele))   return false;   // agar aMap me nahi hai to false return kara denge
                   if(bMap.containsKey(ele)) {        // agar map me element nahi hai to contains karta hai
                       int freq = bMap.get(ele);       // us map ki freq nikalta hai
                       bMap.put(ele,freq+1);
                   }
                   else bMap.put(ele,1);
               }
               for (int ele : bMap.keySet()) {
                   int freq = bMap.get(ele);       // ye freq bMap me se nikalenge
                   int afreq  = aMap.get(ele);      // dekhenge ye freq a me hai ya nahi
                   if (afreq  < freq)   return false;
               }
               return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna