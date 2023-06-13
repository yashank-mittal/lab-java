package Hospital_Project;

import java.util.*;

class Patient
{
    private String name;
    private int age;
    private String contactNumber;

    public Patient(){}
    public Patient(String name,int age,String contactNumber)
    {
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    
}

class Doctor
{
    private String name;
    private String specialization;

    public Doctor(){}
    public Doctor(String name,String specialization)
    {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
}

class Hospital
{
    private String name;
    private List<Doctor> doctors;
    private List<Appointment> appointments;

    
    public Hospital(){}
    public Hospital(String name)
    {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Doctor> getDoctors() {
        return doctors;
    }
    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }
    public List<Appointment> getAppointments() {
        return appointments;
    }
    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public void addDoctor(Doctor doctor)
    {
        doctors.add(doctor);
    }
    
    public void addAppointment(Appointment appointment)
    {
        appointments.add(appointment);
    }
}

class Appointment
{
    private Patient patient;
    private Doctor doctor;
    private String Date;
    private String time;

    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public Appointment(){}
    public Appointment(Patient patient,Doctor doctor,String Date,String time)
    {
        this.patient  = patient;
        this.doctor = doctor;
        this.Date = Date;
        this.time = time;
    }
}

class Hospital_Management
{
    private Hospital hospital;

    public Hospital_Management(){
        this.hospital = new Hospital("My Hospital");
    }
    
    public void displayMenu()
    {
        System.out.println("Welcome to "+ hospital.getName());
        System.out.println("1. Please Book an appointment");
        System.out.println("2. Display All Appointments");
        System.out.println("3. Exit");
    }

    public void bookAppointment()
    {
        Scanner scan = new Scanner(System.in);

        //Patient Details
        System.out.println("Please Enter Patient's Name");
        String patientName = scan.nextLine();
        System.out.println("Please Enter Patient's Age");
        int patientAge = scan.nextInt();
        scan.nextLine(); // for new line
        System.out.println("Please Enter Patient's ContactNumber");
        String patientcontactNumber = scan.nextLine();
        System.out.println("Please Enter Doctor's Name");

        // Doctor's Details
        String doctorName = scan.nextLine();
        System.out.println("Please Enter Doctor's Specialization");
        String doctorspec = scan.nextLine();

        //Appointments's Details
        System.out.println("Enter Patient's Appointment Date");
        String Date = scan.nextLine();        
        System.out.println("Enter Patient's Appointment Time");
        String time = scan.nextLine();

        //Creating Patient,doctors,appointments object
        Patient patient = new Patient(patientName, patientAge, patientcontactNumber);
        Doctor doctor = new Doctor(doctorName, doctorspec);
        Appointment appointment = new Appointment(patient,doctor,Date,time);

        //Book an appointment
        hospital.addAppointment(appointment);               

        System.out.println("Your Appointment Booked Successfully!");
        scan.close();
    }

    public void displayAppointment()
    {
        System.out.println("Your Appointment's List :");
        List<Appointment> appointments = hospital.getAppointments(); 

        if(appointments.isEmpty()){System.out.println("No Appointments are Scheduled");}
        else{
            for(Appointment appointment : appointments)
            {
                System.out.println("Date : "+appointment.getDate());
                System.out.println("Time : "+appointment.getTime());
                System.out.println("Doctor's Name : "+appointment.getDoctor().getName());
                System.out.println("Doctor's Specialization : "+appointment.getDoctor().getSpecialization());
                System.out.println("Patient's Name : "+appointment.getPatient().getName());
                System.out.println("Patient's Age : "+appointment.getPatient().getAge());
                System.out.println("Patient's ContactNumber : "+appointment.getPatient().getContactNumber());
                System.out.println("--------------------------------------------------------------------------");
            }
        }
    }
}


public class Hospital_Project {
    public static void main(String[] args)
    {
        Hospital_Management hospitalManagement = new Hospital_Management();
        Scanner scan = new Scanner(System.in);
        int choice;

        do{
            hospitalManagement.displayMenu();
            choice = scan.nextInt();
            switch(choice)
            {
                case 1 :
                hospitalManagement.bookAppointment();
                break;
                case 2 :
                hospitalManagement.displayAppointment();
                break;
                case 3 :
                System.out.println("Exiting....");
                break;
                default :
                System.out.println("Invalid choice! Please try again");
                break;
            }
            System.out.println();
        }while(choice!=3);

        scan.close();

    }    
}
