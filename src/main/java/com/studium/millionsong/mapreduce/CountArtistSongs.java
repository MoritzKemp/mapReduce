package com.studium.millionsong.mapreduce;

// Use new "mapreduce" API, not "mapred"!
import java.io.IOException;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.hbase.mapreduce.TableMapper;

public class CountArtistSongs {
    
    public static class ArtistSongMapper extends TableMapper<ImmutableBytesWritable, Result>{

        @Override
        protected void map(
                ImmutableBytesWritable key, 
                Result value, 
                Context context) throws IOException, InterruptedException {
            context.write(key, value);
        }    
    }
    
    public static class ArtistSongReducer{
        
    }
}
