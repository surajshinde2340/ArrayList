


class Solve {
    int[] findTwoElement(int arr[], int n) {
    ArrayList<Integer>as=new ArrayList<>();           
        int arr2[]=new int[2];                            
        Arrays.sort(arr);                                 
        int b=0;                                        
        int a= arr.length+1;                            
        int c=0;                                        
        int d=0;                                        
        for(int i=1;i<a;i++){                           
             b+=i;                                
            }                                               
        for(int i=0;i<arr.length;i++){                  
            c+=arr[i];                                  
        }                                               
        for(int i=0;i< arr.length-1;i++){               
            if(arr[i]==arr[i+1]){                       
                d+=arr[i];                              
            }                                           
        }                                               
        int s=c-b;                                        
        int m=d-s;                                        
        for(int i=0;i<arr2.length;i++){                   
            if(i==0){                                     
                as.add(d);                                
            }else if (i==1){                              
                as.add(m);                                
            }                                             
        }                                                 
        for(int i=0;i< as.size();i++){                    
            arr2[i]=as.get(i);                            
        }
        arr=arr2;
        
        return arr;
    

        
    
    }
}
