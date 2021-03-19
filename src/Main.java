import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(100);
        Vector<Integer> vector = new Vector<>(); //ressemble à arraylist en moins rapide, synchroniser entre les threads
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(21);
        priorityQueue.add(654);
        priorityQueue.add(14);
        priorityQueue.add(987);
        priorityQueue.add(-46);
        priorityQueue.add(0);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek()); //range les élements par ordre croissant donc le premier est -46
        System.out.println(priorityQueue.poll());//affiche le premier élément et le supprime du tableau
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(165);
        linkedList.add(-45);
        linkedList.add(52);
        linkedList.add(0);
        linkedList.add(68);
        System.out.println(linkedList);
        System.out.println(linkedList.poll());
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.indexOf(52));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.pollLast());

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(20);
        hashSet.add(0);
        hashSet.add(150);
        hashSet.add(5754);
        hashSet.add(-56);
        System.out.println(hashSet);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(-456);
        linkedHashSet.add(56);
        linkedHashSet.add(6);
        linkedHashSet.add(45);
        linkedHashSet.add(46);
        linkedHashSet.add(4);
        System.out.println(linkedHashSet);//retourne dans l'ordre mais il n'y a toujours pas d'index
        System.out.println(linkedHashSet.contains(12));

        TreeSet<Integer> treeSet = new TreeSet<>(); // fusion du linkedhashset et du PriorityQueue
        treeSet.add(-456);
        treeSet.add(56);
        treeSet.add(6);
        treeSet.add(45);
        treeSet.add(46);
        treeSet.add(4);
        System.out.println(treeSet);
        System.out.println(treeSet.last());
        System.out.println(treeSet.first());
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet.higher(4));
        System.out.println(treeSet.lower(56));

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("elem", 12);
        hashMap.put("elem1", 42);
        hashMap.put("elem2", 36);
        hashMap.put("elem3", -5);
        hashMap.put("elem4", 0);
        System.out.println(hashMap);
        System.out.println(hashMap.get("elem3"));
        hashMap.containsKey("elem1");
        hashMap.containsValue(42);

        hashMap.forEach((key, value)-> System.out.println(key + " : " + value));
        Collection<Integer> values = hashMap.values();
        Collection<String> keys = hashMap.keySet();
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("elem", 12);
        linkedHashMap.put("elem1", 42);
        linkedHashMap.put("elem2", 36);
        linkedHashMap.put("elem3", -5);
        linkedHashMap.put("elem4", 0);
        System.out.println(linkedHashMap);

        TreeMap<String , Integer> treeMap = new TreeMap<>();
        treeMap.put("elem", 12);
        treeMap.put("elem1", 42);
        treeMap.put("elem2", 36);
        treeMap.put("elem3", -5);
        treeMap.put("elem4", 0);
        System.out.println(treeMap);
    }
}
