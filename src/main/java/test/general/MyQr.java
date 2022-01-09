package test.general;



import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

//Java code to generate QR code

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class MyQr {

	// Function to create the QR code
	public static void createQR(String data, String path,
								String charset, Map hashMap,
								int height, int width)
		throws WriterException, IOException
	{

		BitMatrix matrix = new MultiFormatWriter().encode(
			new String(data.getBytes(charset), charset),
			BarcodeFormat.CODE_128, width, height);
		/*
		 * MatrixToImageWriter.writeToFile( matrix, path.substring(path.lastIndexOf('.')
		 * + 1), new File(path));
		 */
		StringBuilder sbQR = new StringBuilder();
		
		BufferedImage buff=MatrixToImageWriter.toBufferedImage(matrix);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(buff, "png", baos);
		byte[] bytes = baos.toByteArray();
		sbQR.append("<img src=\"data:image/png;base64,");
		sbQR.append(Base64.getEncoder().encodeToString(bytes));
		sbQR.append("\"");
		// removed this code as this might not be correct data-filename=\"download.png

		
			sbQR.append("style=\"width: 100px; height:100px;\"/>");
			
			System.out.println(sbQR.toString());
		
	

		
	}

	// Driver code
	public static void main(String[] args)
		throws WriterException, IOException,
			NotFoundException
	{

		// The data that the QR code will contain
		String data = "E9W9876543210";

		// The path where the image will get saved
		String path = "/home/husenaiah/Downloads/Hello1.png";

		// Encoding charset
		String charset = "UTF-8";

		Map<EncodeHintType, ErrorCorrectionLevel> hashMap
			= new HashMap<EncodeHintType,
						ErrorCorrectionLevel>();

		hashMap.put(EncodeHintType.ERROR_CORRECTION,
					ErrorCorrectionLevel.L);

		// Create the QR code and save
		// in the specified folder
		// as a jpg file
		createQR(data, path, charset, hashMap, 100, 200);
		System.out.println("QR Code Generated!!! ");
	}
}
