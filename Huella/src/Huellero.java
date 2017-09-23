

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.EnumMap;
import java.util.concurrent.LinkedBlockingQueue;

import com.digitalpersona.onetouch.*;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.DPFPCapturePriority;
import com.digitalpersona.onetouch.capture.event.*;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import com.digitalpersona.onetouch.readers.DPFPReaderDescription;
import com.digitalpersona.onetouch.readers.DPFPReadersCollection;
import com.digitalpersona.onetouch.ui.swing.*;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import com.digitalpersona.onetouch.verification.DPFPVerificationFactory;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;

public class Huellero {
/*

    private DPFPEnrollment Enrrolador = DPFPGlobal.getEnrollmentFactory().createEnrollment();
    private DPFPVerification Verificador = DPFPGlobal.getVerificationFactory().createVerification();
    private DPFPTemplate template;
    public static String TEMPLATE_PROPERTY="template";
    */

    public void enlistarLectores(){

        DPFPReadersCollection lectores = DPFPGlobal.getReadersFactory().getReaders();
        if (lectores == null || lectores.size() == 0) {
            System.out.printf("No hay lectores disponibles.\n");
            return;
        }
        System.out.printf("Lectores Disponibles:\n");
        for (DPFPReaderDescription readerDescription : lectores)
            System.out.println(readerDescription.getSerialNumber());
    }

    public void capturarHuella(){
        DPFPCapture Lector = DPFPGlobal.getCaptureFactory().createCapture();
        DPFPSample sample = DPFPGlobal.getSampleFactory().createSample();

        Lector.addReaderStatusListener(new DPFPReaderStatusAdapter(){

            @Override public void readerConnected(final DPFPReaderStatusEvent e) {
                System.out.println("Lector Conectado");}

            @Override public void readerDisconnected(final DPFPReaderStatusEvent e) {
                System.out.println("Lector desconectado");}});


        Lector.addSensorListener(new DPFPSensorAdapter(){

            @Override public void fingerTouched(final DPFPSensorEvent e) {
                System.out.println("Dedo Detectado");}

            @Override public void fingerGone(final DPFPSensorEvent e) {
                System.out.println("Dedo Fuera");}});

        Lector.startCapture();

        Lector.add(new

            @Override public void onComplete(final DPFPSampleEvent e) {
                System.out.println("Dedo Fuera");}});
        }


}

