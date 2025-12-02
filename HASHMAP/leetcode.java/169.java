class 169 {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0)
                majority = num;

            if (num == majority)
                count++;
            else
                count--;
        }
        return majority;
    }
}

// // using hashing  -----
// // n/2- occurence= freq>n/3
// // jiski freq zydaa hai wo return krrna hai 

// // HASHMAP    EK KEY HOTA HAI   DUSRA VALUE 
// // KEY =NUMBER , VALUE = FREQUENCY
// // vice versa krrenge to time complexicity bhadh jayegi 

// // creation 
// HashMap <Integer,Integer> map =new HashMap<>();

// // find freq of all no. , and store in map
// //check kro
// for(int i=0;i<nums.length;i++){    // loop 0 to n
// if(map.containsKey(nums[i])){ 
//     map.put(nums[i], map.get(nums[i])+1);

// }else{
//     map.put(nums[i],1);
// }

// }

// // advanced for loop
// for(int key :map.keySet()){
//   // saare map ko traverse karenge 
//   if(map.get(key)>nums.length/2){
//     return key;
//   }    
// }
//        return -1; 

//         // OTHER WAY 

// //Arrays.sort(nums);
// // return nums[nums.length/2];   
// // bhai jo elemnt n/2 occur karega wo return 
//     }
// }
