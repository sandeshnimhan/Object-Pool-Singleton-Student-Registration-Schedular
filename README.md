﻿# Object-Pool-Singleton-Student-Registration-Scheduler
 
Date: Friday, September 30, 2016 
Author: Sandesh Nimhan 
E-mail: snimhan1@binghamton.edu

PURPOSE:

[ Understanding and implementing Object Pool and Singleton Design patterns. By developing Student Course Registration System with muilti-threaded functionality. ]

DATA STRUCTURE: [ Multi-dimensional String Array. Time complexity is O(nm) where n is number of students and m is number of courses required to register. ]

INPUT FORMAT: [ <input_File_Name> <output_File_Name> <number_Of_Threads> <debug_Value> ]

SAMPLE INPUT: [
Student_1 1 2 3 4 5 6 7
Student_2 7 1 2 3 4 5 6
Student_3 6 7 1 2 3 4 5
Student_4 5 6 7 1 2 3 4
Student_5 4 5 6 7 1 2 3
Student_6 3 4 5 6 7 1 2
Student_7 2 3 4 5 6 7 1
Student_8 1 2 3 4 5 6 7
Student_9 7 1 2 3 4 5 6
Student_10 6 7 1 2 3 4 5
Student_11 5 6 7 1 2 3 4
Student_12 4 5 6 7 1 2 3
Student_13 3 4 5 6 7 1 2
Student_14 2 3 4 5 6 7 1
Student_15 1 2 3 4 5 6 7
Student_16 7 1 2 3 4 5 6
Student_17 6 7 1 2 3 4 5
Student_18 5 6 7 1 2 3 4
Student_19 4 5 6 7 1 2 3
Student_20 3 4 5 6 7 1 2
Student_21 2 3 4 5 6 7 1
Student_22 1 2 3 4 5 6 7
Student_23 7 1 2 3 4 5 6
Student_24 6 7 1 2 3 4 5
Student_25 5 6 7 1 2 3 4
Student_26 4 5 6 7 1 2 3
Student_27 3 4 5 6 7 1 2
Student_28 2 3 4 5 6 7 1
Student_29 1 2 3 4 5 6 7
Student_30 7 1 2 3 4 5 6
Student_31 6 7 1 2 3 4 5
Student_32 5 6 7 1 2 3 4
Student_33 4 5 6 7 1 2 3
Student_34 3 4 5 6 7 1 2
Student_35 2 3 4 5 6 7 1
Student_36 1 2 3 4 5 6 7
Student_37 7 1 2 3 4 5 6
Student_38 6 7 1 2 3 4 5
Student_39 5 6 7 1 2 3 4
Student_40 4 5 6 7 1 2 3
Student_41 3 4 5 6 7 1 2
Student_42 2 3 4 5 6 7 1
Student_43 1 2 3 4 5 6 7
Student_44 7 1 2 3 4 5 6
Student_45 6 7 1 2 3 4 5
Student_46 5 6 7 1 2 3 4
Student_47 4 5 6 7 1 2 3
Student_48 3 4 5 6 7 1 2
Student_49 2 3 4 5 6 7 1
Student_50 1 2 3 4 5 6 7
Student_51 7 1 2 3 4 5 6
Student_52 6 7 1 2 3 4 5
Student_53 5 6 7 1 2 3 4
Student_54 4 5 6 7 1 2 3
Student_55 3 4 5 6 7 1 2
Student_56 2 3 4 5 6 7 1
Student_57 1 2 3 4 5 6 7
Student_58 7 1 2 3 4 5 6
Student_59 6 7 1 2 3 4 5
Student_60 5 6 7 1 2 3 4
Student_61 4 5 6 7 1 2 3
Student_62 3 4 5 6 7 1 2
Student_63 2 3 4 5 6 7 1
Student_64 1 2 3 4 5 6 7
Student_65 7 1 2 3 4 5 6
Student_66 6 7 1 2 3 4 5
Student_67 5 6 7 1 2 3 4
Student_68 4 5 6 7 1 2 3
Student_69 3 4 5 6 7 1 2
Student_70 2 3 4 5 6 7 1
Student_71 1 2 3 4 5 6 7
Student_72 7 1 2 3 4 5 6
Student_73 6 7 1 2 3 4 5
Student_74 5 6 7 1 2 3 4
Student_75 4 5 6 7 1 2 3
Student_76 3 4 5 6 7 1 2
Student_77 2 3 4 5 6 7 1
Student_78 1 2 3 4 5 6 7
Student_79 7 1 2 3 4 5 6
Student_80 6 7 1 2 3 4 5
]
