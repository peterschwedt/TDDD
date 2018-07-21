package pl.sda.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
    public class  NotificationServiceTest{
        @Mock
        private EmailService emailService;
        @Mock
        private PigeonService pigeonService;
        @InjectMocks
        private NotificationService notificationService;
        @Test
        public void shouldSendEmailWhenPigeonServiceIsAvailables(){
            //given
            when(emailService.isAvailable()).thenReturn(false);
            when(emailService.isAvailable()).thenReturn(true);
            //when
            notificationService.sendNotification();
            //then
            verify(pigeonService).sendMessage("wyslano pigeon");
        }
    }

