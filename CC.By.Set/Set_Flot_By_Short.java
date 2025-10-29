package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Flot_By_Short;
import CC.Util.By.LMNt.Set_Flot_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Short;
import CC.$.Q$Q.Flot1$1;
import CC.$.Q$Q.Short$Flot;
import CC.$.Q2$.Short_Flot$;
import CC.$.Q_Q$Q.Flot2$1;

public interface Set_Flot_By_Short<From_Typ> extends
	Get_Flot_By_Short,
	Set_Q_By_Short<From_Typ>,
	Set_Flot_By_Q<From_Typ>,
	Short_Flot$
{
	@Lin_Dclar void Set_Flot_By_Short(short By,float Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Short_Flot$(short By,float Valu){Set_Flot_By_Short(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot_By_Short_Sorc(short By,Short$Flot Sorc){Set_Flot_By_Short(By,Sorc.Short$Flot(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot1$1_By_Short(short By,Flot1$1 Fun,float Valu)
		{Set_Flot_By_Short(By,Fun.Flot1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot1$1_By_Short_Sorc(short By,Flot1$1 Fun,Short$Flot Sorc)
			{Set_Flot1$1_By_Short(By,Fun,Sorc.Short$Flot(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot1$1_By_Short(short By,Flot1$1 Fun)
				{Set_Flot1$1_By_Short_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot2$1_By_Short(short By,Flot2$1 Fun,float A,float B)
		{Set_Flot_By_Short(By,Fun.Flot2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot2$1_By_Short_SLit(short By,Flot2$1 Fun,Short$Flot A,float B)
			{Set_Flot2$1_By_Short(By,Fun,A.Short$Flot(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot2$1_By_Short(short By,Flot2$1 Fun,float B)
				{Set_Flot2$1_By_Short_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Flot2$1_By_Short_Sorc(short By,Flot2$1 Fun,Short$Flot A,Short$Flot B)
				{Set_Flot2$1_By_Short_SLit(By,Fun,A,B.Short$Flot(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Flot2$1_By_Short_Sorc(short By,Flot2$1 Fun,Short$Flot B)
					{Set_Flot2$1_By_Short_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default float SGet_Flot_By_Short(short By,float Valu)
	{
		float Stor=Get_Flot_By_Short(By);
		Set_Flot_By_Short(By,Valu);

		return Stor;
	}
}