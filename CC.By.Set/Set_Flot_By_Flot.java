package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Flot_By_Flot;
import CC.Util.By.LMNt.Set_Flot_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Flot;
import CC.$.Q$Q.Flot1$1;
import CC.$.Q2$.Flot_Flot$;
import CC.$.Q_Q$Q.Flot2$1;

public interface Set_Flot_By_Flot<From_Typ> extends
	Get_Flot_By_Flot,
	Set_Q_By_Flot<From_Typ>,
	Set_Flot_By_Q<From_Typ>,
	Flot_Flot$
{
	@Lin_Dclar void Set_Flot_By_Flot(float By,float Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Flot_Flot$(float By,float Valu){Set_Flot_By_Flot(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot_By_Flot_Sorc(float By,Flot1$1 Sorc){Set_Flot_By_Flot(By,Sorc.Flot1$1(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot1$1_By_Flot(float By,Flot1$1 Fun,float Valu)
		{Set_Flot_By_Flot(By,Fun.Flot1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot1$1_By_Flot_Sorc(float By,Flot1$1 Fun,Flot1$1 Sorc)
			{Set_Flot1$1_By_Flot(By,Fun,Sorc.Flot1$1(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot1$1_By_Flot(float By,Flot1$1 Fun)
				{Set_Flot1$1_By_Flot_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot2$1_By_Flot(float By,Flot2$1 Fun,float A,float B)
		{Set_Flot_By_Flot(By,Fun.Flot2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot2$1_By_Flot_SLit(float By,Flot2$1 Fun,Flot1$1 A,float B)
			{Set_Flot2$1_By_Flot(By,Fun,A.Flot1$1(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot2$1_By_Flot(float By,Flot2$1 Fun,float B)
				{Set_Flot2$1_By_Flot_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Flot2$1_By_Flot_Sorc(float By,Flot2$1 Fun,Flot1$1 A,Flot1$1 B)
				{Set_Flot2$1_By_Flot_SLit(By,Fun,A,B.Flot1$1(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Flot2$1_By_Flot_Sorc(float By,Flot2$1 Fun,Flot1$1 B)
					{Set_Flot2$1_By_Flot_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default float SGet_Flot_By_Flot(float By,float Valu)
	{
		float Stor=Get_Flot_By_Flot(By);
		Set_Flot_By_Flot(By,Valu);

		return Stor;
	}
}