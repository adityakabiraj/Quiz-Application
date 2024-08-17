����   =�
      javax/swing/JFrame <init> ()V  [[Ljava/lang/String;	 
     quiz/application/Quiz 	questions	 
    answers	 
    useranswers	 
    name Ljava/lang/String;
 
    	setBounds (IIII)V
 
    getContentPane ()Ljava/awt/Container;	 ! " # $ % java/awt/Color WHITE Ljava/awt/Color;
 ' ( ) * + java/awt/Container setBackground (Ljava/awt/Color;)V
 
 - . / 	setLayout (Ljava/awt/LayoutManager;)V 1 javax/swing/ImageIcon 3 icons/quiz.jpg
 5 6 7 8 9 java/lang/ClassLoader getSystemResource "(Ljava/lang/String;)Ljava/net/URL;
 0 ;  < (Ljava/net/URL;)V > javax/swing/JLabel
 = @  A (Ljavax/swing/Icon;)V
 = 
 
 D E F add *(Ljava/awt/Component;)Ljava/awt/Component;
 = 	 
 I J K qno Ljavax/swing/JLabel; M java/awt/Font O Tahoma
 L Q  R (Ljava/lang/String;II)V
 = T U V setFont (Ljava/awt/Font;)V	 
 X Y K question [ 9Which is used to find and fix bugs in the Java programs.? ] JVM _ JDB a JDK c JRE e EWhat is the return type of the hashCode() method in the Object class? g int i Object k long m void o (Which package contains the Random class? q java.util package s java.lang package u java.awt package w java.io package y 3An interface with no fields or methods is known as? { Runnable Interface } Abstract Interface  Marker Interface � CharSequence Interface � OIn which memory a String is stored, when we create a string using new operator? � Stack � String memory � Random storage space � Heap memory � -Which of the following is a marker interface? � Runnable interface � Remote interface � Readable interface � Result interface � >Which keyword is used for accessing the features of a package? � import � package � extends � export � In java, jar stands for? � Java Archive Runner � Java Archive � Java Application Resource � Java Application Runner � 2Which of the following is a mutable class in java? � java.lang.StringBuilder � java.lang.Short � java.lang.Byte � java.lang.String � LWhich of the following option leads to the portability and security of Java? � Bytecode is executed by JVM � 2The applet makes the Java code secure and portable � Use of exception handling � Dynamic binding between objects � javax/swing/JRadioButton
 � 	 
 � � � opt1 Ljavax/swing/JRadioButton;
 � 
 � ( � Dialog
 � T	 
 � � � opt2	 
 � � � opt3	 
 � � � opt4 � javax/swing/ButtonGroup
 � 	 
 � � � groupoptions Ljavax/swing/ButtonGroup;
 � � E � (Ljavax/swing/AbstractButton;)V � javax/swing/JButton � Next
 � �  � (Ljava/lang/String;)V	 
 � � � next Ljavax/swing/JButton;
 � 
 � T
 ! �  � (III)V
 � (
 � � � + setForeground
 � � � � addActionListener "(Ljava/awt/event/ActionListener;)V � 50-50 Lifeline	 
 � � � lifeline � Submit	 
 � � � submit
 �  
setEnabled (Z)V	 
 count I
 
	
 start (I)V
 
 
setVisible
 java/awt/event/ActionEvent 	getSource ()Ljava/lang/Object;
 
  repaint
 � 	 
 	ans_given
 � getSelection ()Ljavax/swing/ButtonModel;   "#$%& javax/swing/ButtonModel getActionCommand ()Ljava/lang/String;
()*+, java/lang/String equals (Ljava/lang/Object;)Z	 
./ score1 quiz/application/Score
03 4 (Ljava/lang/String;I)V
 678 paint (Ljava/awt/Graphics;)V	 
:; timer  =>? makeConcatWithConstants (I)Ljava/lang/String;	 !AB % RED
DEFG + java/awt/Graphics setColor
D T
DJK R 
drawStringM 
Times up!!      �
QRSTU java/lang/Thread sleep (J)VW java/lang/Exception
VYZ  printStackTrace =
 =]^ � setText
 �]
 �ab � setActionCommand
 �de  clearSelectiong User
 
 �j java/awt/event/ActionListener Code LineNumberTable LocalVariableTable this Lquiz/application/Quiz; i1 Ljavax/swing/ImageIcon; image MethodParameters actionPerformed (Ljava/awt/event/ActionEvent;)V i ae Ljava/awt/event/ActionEvent; StackMapTable e Ljava/lang/Exception; g Ljava/awt/Graphics; time main ([Ljava/lang/String;)V args [Ljava/lang/String; <clinit> 
SourceFile 	Quiz.java BootstrapMethods�
���>� $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;� Time left -  seconds� .  InnerClasses� %java/lang/invoke/MethodHandles$Lookup� java/lang/invoke/MethodHandles Lookup ! 
  i                      J K     Y K     � �     � �     � �     � �     � �     � �     � �     � �   	;   	   	   	/             � k      �*� *
� � 	*
� � *
� � *+� *2
�R� *� �  � &*� ,� 0Y2� 4� :M� =Y,� ?N-��� B*-� CW*� =Y� G� H*� Hd�2� B*� H� LYN� P� S**� H� CW*� =Y� G� W*� W ���2� B*� W� LYN� P� S**� W� CW*� 	2ZS*� 	2\S*� 	2^S*� 	2`S*� 	2bS*� 	2dS*� 	2fS*� 	2hS*� 	2jS*� 	2lS*� 	2nS*� 	2pS*� 	2rS*� 	2tS*� 	2vS*� 	2xS*� 	2zS*� 	2|S*� 	2~S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 	2�S*� 		2�S*� 		2�S*� 		2�S*� 		2�S*� 		2�S*� 2^S*� 2fS*� 2pS*� 2~S*� 2�S*� 2�S*� 2�S*� 2�S*� 2�S*� 	2�S*� �Y� �� �*� � ��� �*� ��  � �*� �� LY�� P� �**� �� CW*� �Y� �� �*� � �0�� �*� ʲ  � �*� ʻ LY�� P� �**� ʶ CW*� �Y� �� �*� � �X�� �*� Ͳ  � �*� ͻ LY�� P� �**� Ͷ CW*� �Y� �� �*� � ���� �*� в  � �*� л LY�� P� �**� ж CW*� �Y� յ �*� �*� �� �*� �*� ʶ �*� �*� Ͷ �*� �*� ж �*� �Y߷ � �*� �L& �(� �*� � LYN� P� �*� � !Y � �� � �*� �  � �*� �*� �**� � CW*� �Y�� � �*� �Lv �(� �*� �� LYN� P� �*� �� !Y � �� � �*� ��  � �*� �*� �**� �� CW*� �Y�� � �*� �L� �(� �*� �� LYN� P� �*� �� !Y � �� � �*� ��  � �*� �*� �*� �� �**� �� CW*��*��   l  
 �     	  
   %  *  8  B  G  T  ]   i ! o # z $ � % � & � ( � ) � * � + � - � . � / � 0 1 3 4% 5/ 69 7C 9M :W ;a <k =u ? @� A� B� C� E� F� G� H� I� K� L� M� N O Q R! S, T7 UB WM XX Yc Zn [y ]� ^� _� `� a� c� d� e� f� g� i� j� k l m n# o. p9 qD rO tZ ul vv w� x� z� {� |� }� ~� �� �� �� � � �# �5 �? �R �[ �f �q �| �� �� �� �� �� �� �� �� �� � � �' �= �G �O �X �e �w �� �� �� �� �� �� �� �� �m   *   �no    �    T|pq  ]sr K s       tu k  _    {+�*� � �*�*� ��*� ��*� ��*� ���*� ֶ� *� �2S� *� �2*� ֶ�! S�� *� �� �*� �� ��`�*��� �+�*� �� W�� "�� �� �� �	� *� ��*� ��� *� ��*� ��*� �� �� �+�*� �� ��*� ֶ� *� �2S� *� �2*� ֶ�! S=*� �� 3*� 22*� 22�'� �-
`�-� �-`�-����*��0Y*� �-�2W�   l   � #   �  �  �  �  � ' � / � 3 � = � M � c � k � s � { � � � � � � � � � � � � � � � � � � � � � � � � �+ �6 �L �X �` �f �k �z �m     - 9v   {no    {wx y    � M0
(� *� s   w   78 k  �    �*+�5�9�<  M+�@�C+� LYN� P�H�9� +,L��I� +LL��I�9d�9N�P*�� N-�X�� ��9��9�	�9*� ��*� ��*� ��*� ���� *� �� �*� �� ��	� �*� ֶ� *� �2S� *� �2*� ֶ�! S>*� �� 3*� 22*� 22�'� �-
`�-� �-`�-����*��0Y*� �-�2W� B*� ֶ� *� �2S� *� �2*� ֶ�! S�`�*���  N X [V l   � *   �  �  �  � % � + � 9 � F � N � T � X � [ � \ � ` � g � k � s � y � ~ � � � �  � � � � � � �	 � � �#).@JZpx"m   4  \ z{  � 9v   �no    �|}  r~  y   ! � 9(TV� B!� *� s   |   	
 k   �     �*� H`�[  �\*� W*� 	22�\*� �*� 	22�_*� �*� 	22�`*� �*� 	22�_*� �*� 	22�`*� �*� 	22�_*� �*� 	22�`*� �*� 	22�_*� �*� 	22�`*� ֶc�   l   2   % & ' -( <* K+ Z- i. x0 �1 �3 �4m       �no     � s      	� k   :     � 
Yf�hW�   l   
   7 8m       ��  s   �   �  k   6      �9���-�   l          	    �   ��    � �� ��   
 ��� 