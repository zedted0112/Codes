// find peak in mountain rage or fin maximum elemenet in an array 


class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end= arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //we are in decreasing array range
                // we could have a possible answer
                end= mid;
            }else{
                start= mid+1;
            }
            
            
            
            
        } return start;
        
        
        
        
    }
}