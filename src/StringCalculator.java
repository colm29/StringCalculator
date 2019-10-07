public class StringCalculator {

    int Add(String numbers) {
        if (numbers == "")
            return 0;

        var numberArray = numbers.split(",|\n");
//        if (numberArray.length > 2)
//            throw new IllegalArgumentException();

        int total = 0;

        for (String s : numberArray) {
            var num = Integer.parseInt(s);
            if (num < 0)
                throw new RuntimeException("Negatives not allowed");
            if (num > 1000)
                num = 0;
            total = total + num;
        }

        return total;
    }

}
