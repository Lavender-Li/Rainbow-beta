# ECE4800J Project -  Rainbow (beta ver.)

## Project Introduction

&nbsp; &nbsp; This project mainly creates an Android application named **Rainbow** that can recognize colors from an image and label their names. Rainbow aims to help people with color vision deficiency to recognize colors at any time and anywhere quickly and conveniently.
 
&nbsp; &nbsp; In beta version, users can upload image from local storage or directly take a photo. Two color detection modes are available: pixel detection mode and blob detection mode. Users can choose to recognize the color in the image in the place where he/she touched, and get its RGB value and the name of this color; or to choose specific color on the image and receive the outline of the color blob and the blob's color.

## Dependencies

&nbsp; &nbsp; This project is developed using Java in *Android Studio 2021.2.1.15*, and has dependency on *OpenCV 4.6.0*. To test the project, you need to first configure OpenCV library to Android Studio; For using the application, users don't need to download extra packages since OpenCV library is included in the *.apk* file.

## Directory Structure
├── README.md

├── AndroidManifest.xml 

│   └── res             

│   &nbsp;&nbsp;&nbsp;└── drawable &nbsp;&nbsp;&nbsp;&nbsp; <font color = grey>// image resource</font>

│   &nbsp;&nbsp;&nbsp;└── layout &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color = grey>// interface setting files</font>

│   &nbsp;&nbsp;&nbsp;└── values 

│   &nbsp;&nbsp;&nbsp;└── xml

│   └── assets&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <font color = grey>// font resources</font>

│   └── java/com/example/testproject  &nbsp;&nbsp;&nbsp;&nbsp; <font color = grey>// back-end source code</font>


## Instructions for use
&nbsp; &nbsp; If you only want to use this app and is uninterested in its code, you can download *Rainbow-beta.apk*  from jBox: https://jbox.sjtu.edu.cn/l/u1CvKk and install it on your Android device. Both virtual device and physical device are available.

&nbsp; &nbsp; If you want to check the source code and run this application in test mode, you can create an empty project in Android Studio and paste the resources into ProjectName/app/src/main. Also, OpenCV library is needed for running. Configuration files are not included in the respitory, since Android Studio and OpenCV configuration will be quite different due to developer's own settings. 

&nbsp; &nbsp; To use **Rainbow**, users can open the application and enter the main page. In the main page, there're two buttons: choose image from local storage, or take photo from camera. Users can choose one way to upload an image.

&nbsp; &nbsp; After uploading image, the application will jump to the color detection page. Users can choose detection mode by pressing the mode switch button on the top of the page. In color pixel detection mode (default), users can touch any place they want to examine on the image, and get the recognition result (color name and RGB value) shown in the texts below. In color blob detection mode, users can touch any place to specify the color they want to examine; the result in text form will shown below just like in pixel detection mode, and the outline of color blobs will also be shown on the image.

&nbsp; &nbsp; In all pages, users can click the information icon in the top-right corner and enter the feedback page. They can read the introduction about the development team and offer feedbacks to developers through the contact information on this page.

## Update Log
&nbsp; &nbsp; Based on alpha version, beta version has added following functions:

- upload images (local storage / camera photo)

- detect color blobs and display outline

- feedback page