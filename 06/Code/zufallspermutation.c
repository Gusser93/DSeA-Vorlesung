void randomPermutation(int[] a) {
    int n = a.length;
    for (int i = n-1); i > 0; i--) {
        int r = random(0,i); // gleichverteilte Zufallszahl im Intervall [0,i)
        swap(a,r,i);
    }
}