/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uassyahrulbinarysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ardin
 */
public class UasSyahrulBinarySearch {

    /**
     * @param args the command line arguments
     */
    public static int binarySearch(String arr[],int l, int r, String x) {

        
        if (r >= l && l <= arr.length - 1) {
 
            int mid = l + (r - l) / 2;
 
            int res = x.compareTo(arr[mid]);
            if (res == 0)
                return mid;
            if (res > 0)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        String arr[] = {"luffy", "zoro", "sanji", "chopper", "brook"};
        System.out.println(Arrays.toString(arr));
        System.out.print("pilih nama : ");
        Scanner bs = new Scanner(System.in);
        String bx = bs.nextLine();

        Arrays.sort(arr);
        int r = arr.length - 1;
        int l = 0;
        int bresult = binarySearch(arr,l,r, bx);
        if (bresult == -1) {
            System.out.print(
                    "Nama Tidak Ditemukan!!");
        } else {
            System.out.println("Nama Berada Pada Urutan array "
                    + bresult + "(atau Pada Urutan ke " + (bresult + 1) + ")");
        }
    }

}
