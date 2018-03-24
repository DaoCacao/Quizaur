package legion.core.quizaur.model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class FirebaseModule {

    @Binds abstract Firebase firebase(FirebaseImpl firebase);

    @Singleton @Provides static DatabaseReference databaseReference() {
        return FirebaseDatabase.getInstance().getReference();
    }
}
