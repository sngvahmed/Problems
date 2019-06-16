package my.sngv.interviewbit.programming.array;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AddOneToNumber {

    public String getInt(ArrayList<Integer> x) {
        String y = x.stream().map(Object::toString)
                .collect(Collectors.joining(""));
        BigInteger b = new BigInteger(y);
        return b.add(new BigInteger("1")).toString();
    }

    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        String num = getInt(A);

        List<Integer> res = num.chars().map(Character::getNumericValue).boxed()
                .collect(Collectors.toList());
        return (ArrayList<Integer>) res;
    }

}
