
import com.kovanLabs.intern.exceptionhandling.Resource;
import com.kovanLabs.intern.exceptionhandling.*;
import com.kovanLabs.intern.stream.Stream;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
            try(Resource r=new Resource()) {
                r.divide();
            }
        Resource r=new Resource();
        r.divide();
        DataProcessingException.FileProcesser fp=new DataProcessingException.FileProcesser();
            try {
                fp.processFile("data.txt");
            }catch (DataProcessingException e){
                System.out.println(e.getMessage());
            }

        List<Integer> number=new Random()
                .ints(100,0,1000)
                .boxed()
                .collect(Collectors.toList());
            IntSummaryStatistics stats= Stream.calculate(number);
        System.out.println("Count : " + stats.getCount());
        System.out.println("Sum : " + stats.getSum());
        System.out.println("Average : " + stats.getAverage());
        System.out.println("Min : " + stats.getMin());
        System.out.println("Max : " + stats.getMax());
    }
}
