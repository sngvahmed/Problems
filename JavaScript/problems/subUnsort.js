var p = { 
    //param A : array of integers
    //return a array of integers
    subUnsort : function(A){
        var j = -1;
        var jj = -1;
        var mx = -1;
        for (var i = 0 ; i < A.length; i++) {
            mx = Math.max(mx, A[i]);

            if (A[i] >= mx) {
                mx = A[i];
                continue;
            }
            if (j == -1) j = i - 1;
            var c = false;
            while (j >= 0 && A[j] > A[i]) { j--; c = true; }
            if (c) j += 1;
            jj = i;
        }  
        if (j == jj) return [-1];
        return [j, jj];
    }
};
module.exports = p;