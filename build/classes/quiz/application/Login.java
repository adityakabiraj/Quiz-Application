����   = �
      javax/swing/JFrame <init> ()V
  	 
   quiz/application/Login getContentPane ()Ljava/awt/Container;	      java/awt/Color WHITE Ljava/awt/Color;
      java/awt/Container setBackground (Ljava/awt/Color;)V
     	setLayout (Ljava/awt/LayoutManager;)V  javax/swing/ImageIcon   icons/login.jpeg
 " # $ % & java/lang/ClassLoader getSystemResource "(Ljava/lang/String;)Ljava/net/URL;
  (  ) (Ljava/net/URL;)V + javax/swing/JLabel
 * -  . (Ljavax/swing/Icon;)V
 * 0 1 2 	setBounds (IIII)V
  4 5 6 add *(Ljava/awt/Component;)Ljava/awt/Component; 8 Simple Minds
 * :  ; (Ljava/lang/String;)V = java/awt/Font ? Viner Hand ITC
 < A  B (Ljava/lang/String;II)V
 * D E F setFont (Ljava/awt/Font;)V
  H  I (III)V
 * K L  setForeground N Enter your name P Mongolian Baiti R javax/swing/JTextField
 Q 	  U V W tfname Ljavax/swing/JTextField;
 Q 0 Z Times New Roman
 Q D ] javax/swing/JButton _ Rules
 \ :	  b c d rules Ljavax/swing/JButton;
 \ 0
 \ 
 \ K
 \ i j k addActionListener "(Ljava/awt/event/ActionListener;)V m Back	  o p d back
  r s t setSize (II)V
  v w t setLocation
  y z { 
setVisible (Z)V
 } ~  � � java/awt/event/ActionEvent 	getSource ()Ljava/lang/Object;
 Q � � � getText ()Ljava/lang/String; � quiz/application/Rules
 � :
   � java/awt/event/ActionListener Code LineNumberTable LocalVariableTable this Lquiz/application/Login; i1 Ljavax/swing/ImageIcon; image Ljavax/swing/JLabel; heading name actionPerformed (Ljava/awt/event/ActionEvent;)V Ljava/lang/String; ae Ljava/awt/event/ActionEvent; StackMapTable MethodParameters main ([Ljava/lang/String;)V args [Ljava/lang/String; 
SourceFile 
Login.java !    �    c d     p d     V W         �  �    �*� *� � � *� � Y� !� 'L� *Y+� ,M,X�� /*,� 3W� *Y7� 9N-�<,-� /-� <Y>(� @� C-� Y � �� G� J*-� 3W� *YM� 9:* �,� /� <YO� @� C� Y � �� G� J*� 3W*� QY� S� T*� T� �,� X*� T� <YY� @� [**� T� 3W*� \Y^� `� a*� a�x� e*� a� Y � �� G� f*� a� � g*� a*� h**� a� 3W*� \Yl� `� n*� n�x� e*� n� Y � �� G� f*� n� � g*� n*� h**� n� 3W*��� q* � �� u*� x�    �   � %             )  5  ;  E  S  c  v  |  �  �  �  �  � ! � " � # � $ � &	 ' (0 ): *B +K -X .i / 0� 1� 2� 4� 5� 6� 7 �   4   � � �    � � �  )� � �  Eo � �  �- � �   � �  �   �     5+� |*� a� *� T� �M*� x� �Y,� �W� +� |*� n� *� x�    �       :  ;  <  = ! > / ? 4 A �        � �    5 � �     5 � �  �    $ �    �   	 � �  �   7     	� Y� �W�    �   
    D  E �       	 � �   �    �    �    �