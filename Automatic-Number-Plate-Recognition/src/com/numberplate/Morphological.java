package com.numberplate;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

public class Morphological {
	public Morphological(){
		   
        //Loading the OpenCV core library
        System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
        
        //Reading image data
        Mat thresh = Highgui.imread("C:\\Users\\Balaji\\eclipse-workspace\\Automatic-Number-Plate-Recognition\\testdata\\test5.jpg");
        
        //Creating destination matrix
        Mat morph = new Mat(thresh.rows(), thresh.cols(), thresh.type());
        
        //Preparing the kernel matrix object
        Mat kernel = Mat.ones(5,5, CvType.CV_32F);
        
        //Applying dilate on the Image
        Imgproc.morphologyEx(thresh, morph, Imgproc.MORPH_CLOSE, kernel);
        
        //Saving image
        Highgui.imwrite("C:\\Users\\Balaji\\eclipse-workspace\\Automatic-Number-Plate-Recognition\\testdata\\test5.jpg", morph);
        System.out.println("Morph image created");

}
}
