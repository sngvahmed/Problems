var p = { 
    //param A : array of integers
    //return an integer
    repeatedNumber : function(A){
        
        for (var i = 0; i < A.length; i++) {
            var indx = Math.abs(A[i]);
            if (A[indx] < 0 ) return indx;
            A[indx] = A[indx] * -1;
        }
        return -1;
    }
};
module.exports = p;
