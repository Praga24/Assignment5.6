

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.*; 


public class AssignMapper extends Mapper<Text,IntWritable, Text, IntWritable> {
	Text outKey=new Text();
	IntWritable one=new IntWritable();
	
	public void map(LongWritable key, Text value, Context context) 
			throws IOException, InterruptedException {
		String data[]=value.toString().split(",");
		outKey.set(data[0]);
			context.write(outKey,one);
	
			
		}
	}
