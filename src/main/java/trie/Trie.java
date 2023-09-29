package trie;


class Trie {


   static class Node{

        Node[] children=new Node[26];
        boolean endOfWord=false;

        Node(){
            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }

        }
    }

    public static Node root=new Node();


    public static void insert(String word)
    {
        Node curr=root;

        for(int level=0;level<word.length();level++)
        {
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx] = new Node();
            }
            curr=curr.children[idx];


        }
        curr.endOfWord=true;

    }

        public static boolean search(String key){

            Node curr=root;
            for(int level=0;level<key.length();level++)
            {
                int idx=key.charAt(level)-'a';
                if(curr.children[idx]==null) return false;
                curr=curr.children[idx];
            }
            return curr.endOfWord;

        }

    public static void main(String[] args) {

       String[] words={"the","b","there","their","any","there","thee"};

        for (String word : words) {
            insert(word);
        }

        System.out.println(search("thee"));
        System.out.println(search("thor"));
        System.out.println(search("ab"));
        System.out.println(search("a"));


    }




}
