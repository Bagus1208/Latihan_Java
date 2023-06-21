public class perulangan_while_for {
    public static void main(String []arg) {
        for(int i = 1; i <= 12; i++) {
            for(int j = 1; j <= 12; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}


/*public class perulangan_while_for {
    public static void main(String [] arg) {
        int i = 2;
        
        while (i<8) {
            int j = 1;
            while(j<i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}*/

/*
   eksekusi:
   
   i = 2 >> while(i<8) : true
   masuk ke while(j<i)
   j = 1 >> while(j<i) : true
   cetak j
   j++
   kembali ke while(j<i)
   j = 2 >> while(j<i) : false
   i++
   kembali ke while(i<8)
   
   i = 3 >> while(i<8) : true
   masuk ke while(j<i)
   j = 2 >> while(j<i) : true
   cetak j // kesamping
   j++
   kembali ke while(j<i)
   j = 3 >> while(j<i) : false
   i++
   kembali ke while(i<8)
   
   i = 4 >> while(i<8) : true
   masuk ke while(j<i)
   j = 3 >> while(j<i) : true
   cetak j // kesamping
   j++
   kembali ke while(j<i)
   j = 4 >> while(j<i) : false
   i++
   kembali ke while(i<8)
   
   i = 5 >> while(i<8) : true
   masuk ke while(j<i)
   j = 4 >> while(j<i) : true
   cetak j // kesamping
   j++
   kembali ke while(j<i)
   j = 5 >> while(j<i) : false
   i++
   kembali ke while(i<8)
   
   i = 6 >> while(i<8) : true
   masuk ke while(j<i)
   j = 5 >> while(j<i) : true
   cetak j // kesamping
   j++
   kembali ke while(j<i)
   j = 6 >> while(j<i) : false
   i++
   kembali ke while(i<8)
   
   i = 7 >> while(i<8) : true
   masuk ke while(j<i) 
   j = 6 >> while(j<i) : true
   cetak j // kesamping
   j++
   kembali ke while(j<i)
   j = 7 >> while(j<i) : false
   i++ 
   kembali ke while(i<8)
   
   i = 8 >> while(i<8) : false
   program berhenti
   
   */