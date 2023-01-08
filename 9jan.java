class 9jan{
    int solve(int N, int[] A) {
        for (int i = N; i > 0; i--) {
        A[i - 1]++;
        if (A[i - 1] > 9) {
            A[i - 1] = 0;
        } else {
            return i;
        }
    }
    return -1;
    }
}