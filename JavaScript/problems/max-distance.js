var p = { 
    //param A : array of integers
    //return an integer
    maximumGap : function(A){
        var t = JSON.stringify(A);
        var L = JSON.parse(t), R = JSON.parse(t);

        L[0] = A[0];
        for (var i = 1 ; i < A.length; i++) {
            L[i] = Math.min(L[i - 1], A[i]);
        }

        R[A.length - 1] = A[A.length - 1];
        for (var i = A.length - 2 ; i >= 0; i--) {
            R[i] = Math.max(R[i + 1], A[i]);
        }

        var mx = 0;
        var i = 0, j = 0;
        
        while (i < A.length && j < A.length) {
            if (L[i] <= R[j]) {
                mx = Math.max(mx, j - i);
                j++;
            } else {
                i++;
            }
        }

        return mx;
    }
};

module.exports = p;


   