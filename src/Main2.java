import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static class LinkedListNode {
        String val;
        LinkedListNode next;

        LinkedListNode(String node_value) {
            val = node_value;
            next = null;
        }
    }


    public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, String val) {
        if (head == null) {
            head = new LinkedListNode(val);
        } else {
            LinkedListNode end = head;
            while (end.next != null) {
                end = end.next;
            }
            LinkedListNode node = new LinkedListNode(val);
            end.next = node;
        }
        return head;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;

        int _list_size = Integer.parseInt(in.nextLine()), _list_i;
        String _list_item;
        LinkedListNode _list = null;
        for (_list_i = 0; _list_i < _list_size; _list_i++) {
            try {
                _list_item = in.nextLine();
            } catch (Exception e) {
                _list_item = null;
            }
            _list = _insert_node_into_singlylinkedlist(_list, _list_item);
        }


        int _sublist_size = Integer.parseInt(in.nextLine()), _sublist_i;
        String _sublist_item;
        LinkedListNode _sublist = null;
        for (_sublist_i = 0; _sublist_i < _sublist_size; _sublist_i++) {
            try {
                _sublist_item = in.nextLine();
            } catch (Exception e) {
                _sublist_item = null;
            }
            _sublist = _insert_node_into_singlylinkedlist(_sublist, _sublist_item);
        }

        res = find(_list, _sublist);
//        bw.write(String.valueOf(res));
//        bw.newLine();
//
//        bw.close();
        System.out.println(res);
    }

    static int find(LinkedListNode list, LinkedListNode sublist) {

        List<String> arrayList = toList(list);
        List<String> subArrayList = toList(sublist);
        for(String a: arrayList) {
            System.out.println(a);
        }
        System.out.println("====================");
        for(String b: subArrayList) {
            System.out.println(b);
        }
        return Collections.indexOfSubList(arrayList, subArrayList);

    }

    static List toList(LinkedListNode list) {
        List<String> arrayList = new ArrayList<>();

        LinkedListNode temp = list;

        while (true) {
            if (temp != null && temp.val != null) {
                arrayList.add(temp.val);
                temp = temp.next;
            } else {
                break;
            }

        }
        return arrayList;
    }
}