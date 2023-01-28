/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uassyahrullinearsearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ardin
 */
public class UasSyahrulLinearSearch {

    /**
     * @param args the command line arguments
     */
    public static int linearSearch(String arr[], int l, int r, String x) {

        if (r < l) {
            return -1;
        }
        if (arr[l].equalsIgnoreCase(x)) {
            return l;
        }
        if (arr[r].equalsIgnoreCase(x)) {
            return r;
        }
        l++;
        r--;
        return linearSearch(arr, l, r, x);
    }

    public static void main(String[] args) {
        String arr[] = {"goku", "vegeta", "naruto", "sasuke", "luffy"};
        System.out.println(Arrays.toString(arr));
        System.out.print("pilih nama : ");
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();

        // Function call]
        int l = 0, r = arr.length - 1;
        int result = linearSearch(arr, l, r, x);
        if (result == -1) {
            System.out.print(
                    "Nama Tidak Ditemukan!!");
        } else {
            System.out.println("Nama Berada Pada Urutan array "
                    + result + "(atau Pada Urutan ke " + (result + 1) + ")");
        }
    }

}
