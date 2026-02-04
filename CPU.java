class CPU
{
    int price;
    CPU(int price)
    {
        this.price=price;
    }
    class processor
    {
        int cores;
        String manufactures;
        processor(int cores,String manufactures)
        {
            this.cores=cores;
            this.manufactures=manufactures;
        }
        void display()
        {
            System.out.println("Processor Cores:"+cores);
            System.out.println("Processor Manufactures"+manufactures);
        }
    }
    static class RAM
    {
        int memory;
        String manufactures;
        RAM(int memory,String manufactures)
        {
            this.memory=memory;
            this.manufactures=manufactures;
        }
        void display()
        {
            System.out.println("Ram memory:"+memory);
            System.out.println("Ram Manufactures"+manufactures);
        }
    }
    public static void main(String[] args)
    {
        CPU c=new CPU(45000);
        System.out.println("CPU Price:"+c.price);

        CPU.processor p=c.new processor(8,"Intel");
        p.display();

        CPU.RAM r=new CPU.RAM(16,"Corsair");
        r.display();
    }

}