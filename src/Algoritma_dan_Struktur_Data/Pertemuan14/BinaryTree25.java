package Algoritma_dan_Struktur_Data.Pertemuan14;

public class BinaryTree25 {
    Node25 root;

    public BinaryTree25() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa25 mahasiswa) {
        Node25 newNode = new Node25(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node25 current = root;
            Node25 parent = null;
            while (true) { 
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find (double ipk) {
        boolean result = false;
        Node25 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node25 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder (Node25 node) {
        if (node!= null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder (Node25 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node25 getSuccessor(Node25 del) {
        Node25 successor = del.right;
        Node25 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            // Cari node (current) yang akan dihapus
            Node25 parent = root;
            Node25 current = root;
            boolean isLeftChild = false;
            while (current != null) {
                if (current.mahasiswa.ipk == ipk) {
                    break;
                } else if (ipk < current.mahasiswa.ipk) {
                    parent = current;
                    current = current.left;
                    isLeftChild = true;
                } else if (ipk > current.mahasiswa.ipk) {
                    parent = current;
                    current = current.left;
                    isLeftChild = true;
                } else if (ipk > current.mahasiswa.ipk) {
                    parent = current;
                    current = current.right;
                    isLeftChild = false;
                }
            }
            // penghapusan
            if (current == null) {
                System.out.println("Data tidak ditemukan");
                return;
            } else {
                // jika tidak ada anak (leaf), maka node dihapus
                if (current.left == null && current.right == null) {
                    if (current == root) {
                        root = null;
                    } else {
                        if (isLeftChild) {
                            parent.left = null;
                        } else {
                            parent.right = null;
                        }
                    }
                } else if(current.right == null) {
                    if (current == root) {
                        parent.left = current.left;
                    } else {
                        if (isLeftChild) {
                            parent.left = current.left;
                        } else {
                            parent.right = current.left;
                        }
                    }
                } else { // jika punya 2 anak
                    Node25 successor = getSuccessor(current);
                    System.out.println("Jika 2 anak. current = ");
                    successor.mahasiswa.tampilInformasi();
                    if (current == root) {
                        root = successor;
                    } else {
                        if (isLeftChild) {
                            parent.left = successor;
                        } else {
                            parent.right = successor;
                        }
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}
