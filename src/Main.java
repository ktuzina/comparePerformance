import java.util.*;

public class Main {

    public static void main(String[] args) {

        compareArraylistAndLinklist();
        compareHashSetAndTreeSet();
        compareHashMapAndTreeMap();
    }

    public static void compareArraylistAndLinklist(){

        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        //add ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++){
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long durationAL = endTime - startTime;

        //add LinkedList
        startTime = System.nanoTime();
        for (int j = 0; j < 5000; j++){
            linkedList.add(j);
        }
        endTime = System.nanoTime();
        long durationLL = endTime - startTime;

        //compare add
        if ((durationAL - durationLL) > 0) {
            System.out.println("Add operation for LinkedList is faster");
        }else{
                System.out.println("Add operation for ArrayList is faster");
            }
        System.out.println(durationAL);
        System.out.println(durationLL);

        //find ArrayList
        startTime = System.nanoTime();
        arrayList.indexOf(4500);
        endTime = System.nanoTime();
        durationAL = endTime - startTime;

        //find LinkedList
        startTime = System.nanoTime();
        linkedList.indexOf(4500);
        endTime = System.nanoTime();
        durationLL = endTime - startTime;

        //compare find
        if ((durationAL - durationLL) > 0) {
            System.out.println("Find operation for LinkedList is faster");
        }else{
            System.out.println("Find operation for ArrayList is faster");
        }
        System.out.println(durationAL);
        System.out.println(durationLL);


        //add ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++){
            arrayList.remove(0);
        }
        endTime = System.nanoTime();
        durationAL = endTime - startTime;

        //add LinkedList
        startTime = System.nanoTime();
        for (int j = 0; j < 5000; j++){
            linkedList.remove(0);
        }
        endTime = System.nanoTime();
        durationLL = endTime - startTime;

        //compare add
        if ((durationAL - durationLL) > 0) {
            System.out.println("Remove operation for LinkedList is faster");
        }else{
            System.out.println("Remove operation for ArrayList is faster");
        }
        System.out.println(durationAL);
        System.out.println(durationLL);


    }

    public static void compareHashSetAndTreeSet(){

        HashSet hashSet = new HashSet();
        TreeSet treeSet = new TreeSet();

        //add HashSet
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++){
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        long durationHS = endTime - startTime;

        //add TreeSet
        startTime = System.nanoTime();
        for (int j = 0; j < 5000; j++){
            treeSet.add(j);
        }
        endTime = System.nanoTime();
        long durationTS = endTime - startTime;

        //compare add
        if ((durationHS - durationTS) > 0) {
            System.out.println("Add operation for TreeSet is faster");
        }else{
            System.out.println("Add operation for HashSet is faster");
        }
        System.out.println(durationHS);
        System.out.println(durationTS);

        //find HashSet
        startTime = System.nanoTime();
        hashSet.contains(2500);
        endTime = System.nanoTime();
        durationHS = endTime - startTime;

        //find TreeSet
        startTime = System.nanoTime();
        treeSet.contains(2500);
        endTime = System.nanoTime();
        durationTS = endTime - startTime;

        //compare find
        if ((durationHS - durationTS) > 0) {
            System.out.println("Find operation for TreeSet is faster");
        }else{
            System.out.println("Find operation for HashSet is faster");
        }
        System.out.println(durationHS);
        System.out.println(durationTS);

        //remove HashSet
        startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++){
            hashSet.remove(0);
        }
        endTime = System.nanoTime();
        durationHS = endTime - startTime;

        //remove TreeSet
        startTime = System.nanoTime();
        for (int j = 0; j < 5000; j++){
            treeSet.remove(0);
        }
        endTime = System.nanoTime();
        durationTS = endTime - startTime;

        //compare remove
        if ((durationHS - durationTS) > 0) {
            System.out.println("Remove operation for TreeSet is faster");
        }else{
            System.out.println("Remove operation for HashSet is faster");
        }
        System.out.println(durationHS);
        System.out.println(durationTS);

    }
    public static void compareHashMapAndTreeMap(){

        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();

        //add HashMap
        long startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++){
            hashMap.put(i, i+1);
        }
        long endTime = System.nanoTime();
        long durationHM = endTime - startTime;

        //add TreeMap
        startTime = System.nanoTime();
        for (int j = 0; j < 5000; j++){
            treeMap.put(j, j+1);
        }
        endTime = System.nanoTime();
        long durationTM = endTime - startTime;

        //compare add
        if ((durationHM - durationTM) > 0) {
            System.out.println("Add operation for TreeMap is faster");
        }else{
            System.out.println("Add operation for HashMap is faster");
        }
        System.out.println(durationHM);
        System.out.println(durationTM);

        //find HashMap
        startTime = System.nanoTime();
        hashMap.containsValue(4000);
        endTime = System.nanoTime();
        durationHM = endTime - startTime;

        //find TreeMap
        startTime = System.nanoTime();
        treeMap.containsValue(4000);
        endTime = System.nanoTime();
        durationTM = endTime - startTime;

        //compare find
        if ((durationHM - durationTM) > 0) {
            System.out.println("Find operation for TreeMap is faster");
        }else{
            System.out.println("Find operation for HashMap is faster");
        }
        System.out.println(durationHM);
        System.out.println(durationTM);

        //remove HashMap
        startTime = System.nanoTime();
        for (int i = 0; i < 5000; i++){
            hashMap.remove(0);
        }
        endTime = System.nanoTime();
        durationHM = endTime - startTime;

        //remove TreeSet
        startTime = System.nanoTime();
        for (int j = 0; j < 5000; j++){
            treeMap.remove(0);
        }
        endTime = System.nanoTime();
        durationTM = endTime - startTime;

        //compare remove
        if ((durationHM - durationTM) > 0) {
            System.out.println("Remove operation for TreeSet is faster");
        }else{
            System.out.println("Remove operation for HashSet is faster");
        }
        System.out.println(durationHM);
        System.out.println(durationTM);

    }

}
