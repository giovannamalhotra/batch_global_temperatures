import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

import org.apache.log4j.Logger
import org.apache.log4j.Level

/**
  * Program to process global temperatures data. It extracts relevant data and transform it to a table structure
  */
object global_temperatures {

  def main(args: Array[String]): Unit = {

    /** Suppress the logs */
    Logger.getLogger("org").setLevel(Level.OFF)
    Logger.getLogger("akka").setLevel(Level.OFF)

    /** Create Spark Configuration */
    val sparkConf = new SparkConf().setMaster("local[2]").setAppName("mySpark")

    /** Create Spark Context */
    val sc = new SparkContext(sparkConf)

    /** Create RDD */
    var dataRDD = sc.textFile("input/GlobalLandTemperaturesByCountry.csv")


    /** Do transformations */


    /** Actions */
    println(dataRDD.count())

  }

}
