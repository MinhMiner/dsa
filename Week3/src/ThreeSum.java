import edu.princeton.cs.algs4.*;

public class ThreeSum {
 
     // Do not instantiate.
     private ThreeSum() { }
 
     /**
      * Prints to standard output the (i, j, k) with {@code i < j < k}
      * such that {@code a[i] + a[j] + a[k] == 0}.
      *
      * @param a the array of integers
      */
     public static void printAll(int[] a) {
         int n = a.length;
         for (int i = 0; i < n; i++) {
             for (int j = i+1; j < n; j++) {
                 for (int k = j+1; k < n; k++) {
                     if (a[i] + a[j] + a[k] == 0) {
                         StdOut.println(a[i] + " " + a[j] + " " + a[k]);
                     }
                 }
             }
         }
     }
 
     /**
      * Returns the number of triples (i, j, k) with {@code i < j < k}
      * such that {@code a[i] + a[j] + a[k] == 0}.
      *
      * @param  a the array of integers
      * @return the number of triples (i, j, k) with {@code i < j < k}
      *         such that {@code a[i] + a[j] + a[k] == 0}
      */
     public static int count(int[] a) {
         int n = a.length;
         int count = 0;
         for (int i = 0; i < n; i++) {
             for (int j = i+1; j < n; j++) {
                 for (int k = j+1; k < n; k++) {
                     if (a[i] + a[j] + a[k] == 0) {
                         count++;
                     }
                 }
             }
         }
         return count;
     }
 
     /**
      * Reads in a sequence of integers from a file, specified as a command-line argument;
      * counts the number of triples sum to exactly zero; prints out the time to perform
      * the computation.
      *
      * @param args the command-line arguments
      */
     public static void main(String[] args)  {
         In in = new In(args[0]);
         int[] a = in.readAllInts();
 
         Stopwatch timer = new Stopwatch();
         int count = count(a);
         StdOut.println("elapsed time = " + timer.elapsedTime());
         StdOut.println(count);
     }
}
 
 /******************************************************************************
  *  Copyright 2002-2022, Robert Sedgewick and Kevin Wayne.
  *
  *  This file is part of algs4.jar, which accompanies the textbook
  *
  *      Algorithms, 4th edition by Robert Sedgewick and Kevin Wayne,
  *      Addison-Wesley Professional, 2011, ISBN 0-321-57351-X.
  *      http://algs4.cs.princeton.edu
  *
  *
  *  algs4.jar is free software: you can redistribute it and/or modify
  *  it under the terms of the GNU General Public License as published by
  *  the Free Software Foundation, either version 3 of the License, or
  *  (at your option) any later version.
  *
  *  algs4.jar is distributed in the hope that it will be useful,
  *  but WITHOUT ANY WARRANTY; without even the implied warranty of
  *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  *  GNU General Public License for more details.
  *
  *  You should have received a copy of the GNU General Public License
  *  along with algs4.jar.  If not, see http://www.gnu.org/licenses.
  ******************************************************************************/