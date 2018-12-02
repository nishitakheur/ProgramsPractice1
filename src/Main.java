import sun.jvm.hotspot.memory.Space;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//        CountOccurances co = new CountOccurances();
//        co.countOccurancesMethod("fukekdkkkdefwy");
//
//        Anagram an = new Anagram();
//        Boolean ana = an.anagramMethod("asdasd", "aassdd");
//        System.out.println("Is anagram?"+" "+ana);


//        HashsetExample hsex = new HashsetExample();
//
//        String strDupli = "hhhgelhhyennn";
//        String dupliFree = hsex.removeDuplicates(strDupli);
//        System.out.println("Duplicates removed from"+" "+strDupli+" "+"as"+" "+dupliFree);
//
//        Compression comp = new Compression();
//        System.out.println("Compression of the word is:"+comp.compressionAlgo("abbccaaccdddff"));

//        Reverse rev = new Reverse();
//        System.out.println("Reverse is" + " " + rev.reverseMethod("nishita"));
//
//        Palindrome pali = new Palindrome();
//        System.out.println("Is Palindrome?"+ " " + pali.findPalindrome("dasphsad"));

//        Brackets brc = new Brackets();
//        System.out.println("Is the bracket correct?"+" "+brc.isCorrect("[{()}]"));

//        Marks mk = new Marks();
//        HashMap<String, Integer> hmMarks = new HashMap<String, Integer>();
//        hmMarks.put("Nishi",98);
//        hmMarks.put("Nishant",88);
//        hmMarks.put("JB",58);
//        hmMarks.put("Anna", 65);
//        TreeMap treeMap = mk.sortMarks(hmMarks);
//        System.out.println("Sorted w.r.t Marks in aescending order"+" "+treeMap);

//
//        MarksNew mknew = new MarksNew();
//        mknew.marksNewSort();
//        VendingMachine vm = new VendingMachine();
//        vm.getSoda();

//            ParkingLot pk = new ParkingLot();
//            pk.createParkingLot();

//        Unique u = new Unique();
//        System.out.println("Is unique?"+" "+u.isUnique(""));

//        ReverseArray ra = new ReverseArray();
//        System.out.println("Reverse is:" + " " + ra.rev("nishita is a good girl"));

//        SpaceWith20 s = new SpaceWith20();
//        System.out.println("The replaced string is"+" "+s.replace("gh lo"));

//        Rotation rt = new Rotation();
//        System.out.println("Is rotation?:"+" "+rt.isRotation("waterbottle","erbottlewaT"));

//        SumIsEight sm = new SumIsEight();
//        int a[] = {1,2,3,5,2,7};
//        sm.sumTotal(a);

//        Swap sw = new Swap();
//        sw.swap(6,5);

//        int a[][] = new int[][]{{2,2,2},{2,2,1},{1,1,1}};
//        TicTac tt = new TicTac();
//
//        System.out.println("Who won the game?"+tt.didWin(a));

//        TrailingZero tz = new TrailingZero();
//        System.out.println("Number of Trailing zeroes in Factorial is"+tz.trailing(27));

//        Subsequence sq = new Subsequence();
//        int a[]= new int[]{1,2,-4,5,6,-3,2,4};
//        System.out.println("Max sum in this array is"+" "+sq.sequenceSum(a));

//        Factorial f1= new Factorial();
//        System.out.println("Factorial is"+" "+f1.factorial(5));
//        Average avg = new Average();
//        int a[]= new int[]{1,2,3,4,5,8};
//
//        System.out.println("Average is"+" "+avg.average(a));

//        Sort s = new Sort();
//        int a[]= new int[]{9,26,6,1,2,3,4,5,8};
//        s.sort(a);
//        Addition ad = new Addition();
//        System.out.println("Addition is"+" "+ad.addition(6,12));
//
//        SumThreeFive sm = new SumThreeFive();
//        System.out.println("Sum of all multiples of 3 and 5 is:"+" "+sm.add());

//        MajorityElement me = new MajorityElement();
//        int a[]= {4,7,7,4,4,4,9,7,6,5,3,4,4,4,5};
//        me.majorityElementMethod(a);

//        Peak pk = new Peak();
//        int a[]={1,4,3,6,7,5};
//
//        System.out.println("First peak found is"+" "+pk.PeakElementMethod(a));

//        DiffisK dk = new DiffisK();
//        int a[]={1,2,3,4,5};
//        System.out.println("Number of unique pairs is"+" "+dk.diffIsKMethod(a,2));

//        int a[]={1,1,0,1,1,1};
//        ConsequitiveOnes co = new  ConsequitiveOnes();
//        System.out.print("Consequitive maximum ones are"+" "+co.findMaxConsecutiveOnes(a));

//        int a[]={4,3,2,7,8,2,3,1};
//        DisappearArray da = new DisappearArray();
//        System.out.print("Disappearing numbers are"+" "+da.findDisappearedNumbers(a));

//        int a[]={1,2};
//        ThirdMax tm = new ThirdMax();
//        System.out.print("Third max is"+" "+tm.thirdMax(a));
//        int a[]={1,3,5,6};
//        SearchInsert si = new SearchInsert();
//        System.out.print("Element is at/should be at position"+" "+si.searchInsert(a, 7));
//        int a[]={7, 1, 5, 3, 6, 4};
//        Stock stck = new Stock();
//        System.out.print("Maximum Profit possible is"+" "+stck.maxProfit(a));

//        int a[]={100, 80, 120, 130, 70, 60, 100, 125};
//        Stock2 stck = new Stock2();
//        System.out.print("Maximum Profit possible is"+" "+stck.maxProfit(a));
//        int a[]={0, 1, 3};
//        MissingNumber msn = new MissingNumber();
//        System.out.print("Missing number is"+" "+msn.missingNumber(a));
//        int a[]={9,9,9,9};
//        PlusOne po = new PlusOne();
//        System.out.print("Add one and the number is"+" "+po.plusOne(a));

//        int a[]={1,1,2,2,3,3};
//        RemoveDupsCount rdco = new RemoveDupsCount();
//        System.out.print("After dups removal count is"+" "+rdco.removeDuplicates(a));

//        int a[]={3,2,2,4,5,3};
//        RemoveElement po = new RemoveElement();
//        System.out.print("Remove element and new length is"+" "+po.removeElement(a, 3));

//        int a[]={3,2,2,4,5,3};
//        NearbyDuplicate nd= new NearbyDuplicate();
//        System.out.println("Nearby duplicates is"+" "+nd.containsNearbyDuplicate(a,3));

//        RotateByK rk= new RotateByK();
//        int a[]={1,2};
//        rk.rotate(a,3);

//        LastWord lw= new LastWord();
//        System.out.println("Length of last word is" + " " + lw.lengthOfLastWord("     "));

//        BracketMatching bm= new BracketMatching();
//        System.out.println("Brackets are matched" + " " + bm.isValid("(("));

//        ValidCaps vcps = new ValidCaps();
//        System.out.println("Caps is correct case 1:"+" "+vcps.detectCapitalUse("Nishita"));
//        System.out.println("Caps is correct case 2:" + " " + vcps.detectCapitalUse("NISHITA"));
//        System.out.println("Caps is correct case 3:"+" "+vcps.detectCapitalUse("Nishita"));
//        System.out.println("Caps is in-correct case 4:"+" "+vcps.detectCapitalUse("NiSHiTA"));
//
//        RepeatedString rpstr = new RepeatedString();
//        System.out.println("Repeated string present" + " " + rpstr.repeatedSubstringPattern("abababa"));

//        Segments sg = new Segments();
//        System.out.println("Number of segments is"+sg.countSegments(""));

                Reverse rv= new Reverse();
        System.out.println("Reverse is" + " " + rv.reverseMethod("nishita"));
//        Reverse1 rv= new Reverse1();
//        System.out.println("Reverse is" + " " + rv.reverseString("nishita"));

//        Reverse2 rv= new Reverse2();
//        System.out.println("Reverse is" + " " + rv.reverseWords("the sky is blue"));

//        Reverse3 rv= new Reverse3();
//        System.out.println("Reverse is" + " " + rv.reverseEveryWord("the sky is blue"));

//        Kthfrequent kf =new Kthfrequent();
//        int a[]={1,1,1,2,2,3};
//        kf.topKFrequent(a,2);

//        FindString fs = new FindString();
//        System.out.println("Index of the first occurrence of needle in haystack is"+" "+fs.strStr("nishita","ish"));

//        Attendance a = new Attendance();
//        System.out.println("Rewarded?"+" "+a.checkRecord("ALL"));

//        LUS lus = new LUS();
//        System.out.println("Longest uncommon subsequence is"+" "+lus.findLUSlength("aba", "cdc"));

//        RomanToInt rmnint = new RomanToInt();
//        System.out.println("Integer representation of Roman number is"+" "+rmnint.romanToInt("MCCCXLV"));

//        LCPrefix lcp = new LCPrefix();
//        String strs[]={"a","a","b"};
//        System.out.println("Least Common prefix is"+" "+lcp.longestCommonPrefix(strs));

//        RansomNotes rn = new RansomNotes();
//        System.out.println("Can construct"+" "+rn.canConstruct("a", "b"));

    }
}
